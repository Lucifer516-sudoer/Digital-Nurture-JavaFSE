#!/bin/bash

# -----------------------------------
# Author: Claude Sonet 5
# Ideated by: Lucifer516-sudoer
# -----------------------------------
#
# Usage:
#   Interactive (unchanged):  output_capture.sh <outputs_root> <solutions_root> <script_dir>
#   Non-interactive:          output_capture.sh <outputs_root> <solutions_root> <script_dir> \
#                                <mainClass> <week> <day> <solutionName> [notes] [waitSeconds]
#     - all four of mainClass/week/day/solutionName must be given together for non-interactive mode.
#     - notes is optional; if omitted, it's forwarded as empty and copy_solution.sh falls back
#       to its own stdin prompt for notes only (everything else stays non-interactive).
#     - waitSeconds is optional (default 8). How long to let the program run before
#       screenshotting and killing it. Bump this up for slow-booting Spring Boot apps.
#
# The program is run in the BACKGROUND regardless of whether it's a short-lived CLI
# program or a long-running server (Spring Boot, etc). After waitSeconds, it is
# screenshotted and then killed (process group, so the underlying JVM dies too, not
# just the mvn wrapper). This means the script never hangs waiting for Ctrl-C.

set -uo pipefail
# NOTE: not using -e here on purpose — we expect to kill our own background job,
# which can make the shell see a non-zero exit from `wait`, and we don't want that
# to abort the whole script.

OUTPUTS_ROOT="${1:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir> [mainClass] [week] [day] [solutionName] [notes] [waitSeconds]}"
SOLUTIONS_ROOT="${2:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir> [mainClass] [week] [day] [solutionName] [notes] [waitSeconds]}"
SCRIPT_DIR="${3:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir> [mainClass] [week] [day] [solutionName] [notes] [waitSeconds]}"
mainClass="${4:-}"
week="${5:-}"
day="${6:-}"
solutionName="${7:-}"
notesArg="${8:-}"
waitSeconds="${9:-8}"

echo "CWD: $(pwd)"

# 1. Which class to run
while [[ -z "$mainClass" ]]; do
    printf "Enter the fully-qualified main class to run [Eg: com.dn5.App]: "
    read -r mainClass
    [[ -z "$mainClass" ]] && echo "⚠️  Main class cannot be empty."
done

while [[ -z "$week" ]]; do
    printf "Enter the week number: [Eg: 01] "
    read -r week
    [[ -z "$week" ]] && echo "⚠️  Week number cannot be empty."
done

while [[ -z "$day" ]]; do
    printf "Enter the day number: [Eg: 33] "
    read -r day
    [[ -z "$day" ]] && echo "⚠️  Day number cannot be empty."
done

while [[ -z "$solutionName" ]]; do
    printf "Enter the name for this solution [Eg: sl4j-handson-001]: "
    read -r solutionName
    [[ -z "$solutionName" ]] && echo "⚠️  Name cannot be empty."
done

# 2. Run the java file in the background, in its own process group,
#    so we can kill the whole tree later (mvn + the JVM it spawns) instead of
#    just the mvn wrapper, which would otherwise leave a Spring Boot server running.
echo "▶️  Running $mainClass in background (will capture + stop after ${waitSeconds}s) ..."
setsid mvn -q -f pom.xml exec:java -Dexec.mainClass="$mainClass" \
    > /tmp/output_capture_run.log 2>&1 &
runPid=$!

echo "⏳ Waiting ${waitSeconds}s for it to start/produce output ..."
sleep "$waitSeconds"

# Check whether it's still alive (server) or already exited (short-lived CLI program).
if kill -0 "$runPid" 2>/dev/null; then
    echo "ℹ️  Process still running after ${waitSeconds}s (looks like a server) — capturing now, then stopping it."
    stillRunning=true
else
    echo "ℹ️  Process already exited on its own (looks like a short-lived program)."
    stillRunning=false
fi

# 3. Capture screenshot automatically
outputDir="${OUTPUTS_ROOT}/week-${week}/day-${day}"
mkdir -p "$outputDir"
safeName="${solutionName//\//_}"
screenshotPath="${outputDir}/${safeName}.png"

if command -v grim >/dev/null 2>&1; then
    grim "$screenshotPath"
    echo "✅ Screenshot saved to $screenshotPath"
else
    echo "❌ grim not found — cannot capture screenshot."
fi

# 4. Stop the process (whole process group, so the JVM dies too, not just mvn).
if [[ "$stillRunning" == true ]]; then
    echo "🛑 Stopping process group $runPid ..."
    kill -TERM -- -"$runPid" 2>/dev/null
    sleep 1
    kill -KILL -- -"$runPid" 2>/dev/null
fi
wait "$runPid" 2>/dev/null
echo "✅ Run finished/stopped. Log saved at /tmp/output_capture_run.log"

# 5. Copy the solution (pom.xml + all .java files), reusing the same week/day/name.
#    Notes forwarded if provided; if empty, copy_solution.sh falls back to its own
#    interactive stdin prompt for notes only.
if [[ -n "$notesArg" ]]; then
    "${SCRIPT_DIR}/copy_solution.sh" "$SOLUTIONS_ROOT" "$week" "$day" "$solutionName" "$notesArg"
else
    "${SCRIPT_DIR}/copy_solution.sh" "$SOLUTIONS_ROOT" "$week" "$day" "$solutionName"
fi

# 6. Git commit everything together
git add "$screenshotPath" "$SOLUTIONS_ROOT/week-${week}/day-${day}-${solutionName}"
if git diff --cached --quiet; then
    echo "Nothing new to commit."
else
    git commit -m "log: capture + solution ${solutionName} (week-${week} day-${day})"
    echo "✅ Committed."
fi