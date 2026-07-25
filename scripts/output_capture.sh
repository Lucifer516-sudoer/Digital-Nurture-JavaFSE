#!/bin/bash

# -----------------------------------
# Author: Claude Sonet 5
# Ideated by: Lucifer516-sudoer
# -----------------------------------
#
# Usage:
#   Interactive (unchanged):  output_capture.sh <outputs_root> <solutions_root> <script_dir>
#   Non-interactive:          output_capture.sh <outputs_root> <solutions_root> <script_dir> \
#                                <mainClass> <week> <day> <solutionName> [notes]
#     - all four of mainClass/week/day/solutionName must be given together for non-interactive mode.
#     - notes is optional; if omitted, it's forwarded as empty and copy_solution.sh falls back
#       to its own stdin prompt for notes only (everything else stays non-interactive).

set -euo pipefail

OUTPUTS_ROOT="${1:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir> [mainClass] [week] [day] [solutionName] [notes]}"
SOLUTIONS_ROOT="${2:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir> [mainClass] [week] [day] [solutionName] [notes]}"
SCRIPT_DIR="${3:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir> [mainClass] [week] [day] [solutionName] [notes]}"
mainClass="${4:-}"
week="${5:-}"
day="${6:-}"
solutionName="${7:-}"
notesArg="${8:-}"

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

# 2. Run the java file
echo "▶️  Running $mainClass ..."
mvn -q -f pom.xml exec:java -Dexec.mainClass="$mainClass"
echo "✅ Program finished."

sleep 1
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
    exit 1
fi

# 4. Copy the solution (pom.xml + all .java files), reusing the same week/day/name.
#    Notes forwarded if provided; if empty, copy_solution.sh falls back to its own
#    interactive stdin prompt for notes only.
if [[ -n "$notesArg" ]]; then
    "${SCRIPT_DIR}/copy_solution.sh" "$SOLUTIONS_ROOT" "$week" "$day" "$solutionName" "$notesArg"
else
    "${SCRIPT_DIR}/copy_solution.sh" "$SOLUTIONS_ROOT" "$week" "$day" "$solutionName"
fi

# 5. Git commit everything together
git add "$screenshotPath" "$SOLUTIONS_ROOT/week-${week}/day-${day}-${solutionName}"
if git diff --cached --quiet; then
    echo "Nothing new to commit."
else
    git commit -m "log: capture + solution ${solutionName} (week-${week} day-${day})"
    echo "✅ Committed."
fi