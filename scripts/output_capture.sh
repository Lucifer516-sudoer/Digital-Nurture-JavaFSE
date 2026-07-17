#!/bin/bash

# -----------------------------------
# Author: Claude Sonet 5
# Ideated by: Lucifer516-sudoer
# -----------------------------------


set -euo pipefail

OUTPUTS_ROOT="${1:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir>}"
SOLUTIONS_ROOT="${2:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir>}"
SCRIPT_DIR="${3:?Usage: output_capture.sh <outputs_root> <solutions_root> <script_dir>}"

echo "CWD: $(pwd)"

# 1. Which class to run
while true; do
    printf "Enter the fully-qualified main class to run [Eg: com.dn5.App]: "
    read -r mainClass
    [[ -n "$mainClass" ]] && break
    echo "⚠️  Main class cannot be empty."
done

while true; do
    printf "Enter the week number: [Eg: 01] "
    read -r week
    [[ -n "$week" ]] && break
    echo "⚠️  Week number cannot be empty."
done

while true; do
    printf "Enter the day number: [Eg: 33] "
    read -r day
    [[ -n "$day" ]] && break
    echo "⚠️  Day number cannot be empty."
done

while true; do
    printf "Enter the name for this solution [Eg: sl4j-handson-001]: "
    read -r solutionName
    [[ -n "$solutionName" ]] && break
    echo "⚠️  Name cannot be empty."
done

# 2. Run the java file
echo "▶️  Running $mainClass ..."
mvn -q -f pom.xml exec:java -Dexec.mainClass="$mainClass"
echo "✅ Program finished."

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

# 4. Copy the solution (pom.xml + all .java files), reusing the same week/day/name
"${SCRIPT_DIR}/copy_solution.sh" "$SOLUTIONS_ROOT" "$week" "$day" "$solutionName"

# 5. Git commit everything together
git add "$screenshotPath" "$SOLUTIONS_ROOT/week-${week}/day-${day}-${solutionName}"
if git diff --cached --quiet; then
    echo "Nothing new to commit."
else
    git commit -m "log: capture + solution ${solutionName} (week-${week} day-${day})"
    echo "✅ Committed."
fi