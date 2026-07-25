#!/bin/bash

# 
# Authors: Lucifer516-sudoer & Claude Sonet 5
#

# --------------------------------------------------------------------------------------------------------------------------------------
# Disclaimer:
# I dont know why but, I am having two folders, one called projects, and another purposefully having the redundant code called `solutions`
# So this script will ease my pain, with making the copy process easy
# Since, I will be calling this with the help of `task`, this will be centered around that
# --------------------------------------------------------------------------------------------------------------------------------------
#
# Usage:
#   Interactive (unchanged):  copy_solution.sh <solutions_root>
#   Non-interactive:          copy_solution.sh <solutions_root> <week> <day> <solutionName> [notes]
#     - notes is optional; if omitted, notes are read from stdin (heredoc/pipe) same as before.
#     - if notes is passed as an arg, stdin is NOT touched, so this is safe to call from Taskfile
#       without needing a heredoc.
#
# Java files are copied preserving their package folder structure (everything from
# src/main/java/... or src/test/java/... onward), instead of flattening into one folder.
# This means the copied solution can actually be compiled/inspected with its packages intact.
# --------------------------------------------------------------------------------------------------------------------------------------

SOLUTIONS_ROOT="${1:?Usage: copy_solution.sh <solutions_root> [week] [day] [solutionName] [notes]}"
week="${2:-}"
day="${3:-}"
solutionName="${4:-}"
notesArg="${5:-}"

echo "CWD: $(pwd)"

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
    printf "Enter the dir name for the solution: [Eg: sl4j-handson-001] "
    read -r solutionName
    [[ -z "$solutionName" ]] && echo "⚠️  Solution name cannot be empty."
done

targetDir="${SOLUTIONS_ROOT}/week-${week}/day-${day}-${solutionName}"
echo "🎯 Target Directory: ${targetDir}"

mkdir -p "$targetDir"

if [[ -f pom.xml ]]; then
    cp -v pom.xml "$targetDir"
else
    echo "⚠️  No pom.xml found in $(pwd), skipping."
fi

mapfile -t javaFiles < <(find . -name "*.java" -type f)

if [[ ${#javaFiles[@]} -gt 0 ]]; then
    for f in "${javaFiles[@]}"; do
        # Strip leading "./"
        relPath="${f#./}"

        # Preserve package structure: keep everything from "src/main/java/" or
        # "src/test/java/" onward. If neither marker is found, fall back to a
        # flat copy into the root of targetDir (old behavior) and warn.
        if [[ "$relPath" == *"src/main/java/"* ]]; then
            destSubPath="${relPath#*src/main/java/}"
            destFile="${targetDir}/src/main/java/${destSubPath}"
        elif [[ "$relPath" == *"src/test/java/"* ]]; then
            destSubPath="${relPath#*src/test/java/}"
            destFile="${targetDir}/src/test/java/${destSubPath}"
        else
            echo "⚠️  Could not determine package path for '$relPath', copying flat to target root."
            destFile="${targetDir}/$(basename "$f")"
        fi

        mkdir -p "$(dirname "$destFile")"
        cp -v "$f" "$destFile"
    done
else
    echo "⚠️  No .java files found under $(pwd), skipping."
fi

# Compute relative path depth from targetDir back up to the repo root,
# so the README image link works regardless of whether solutionName contains a slash.
solutionsRootAbs=$(cd "$SOLUTIONS_ROOT" && pwd)
targetDirAbs=$(cd "$targetDir" && pwd)
relPathFromRepoRoot="${targetDirAbs#"$solutionsRootAbs"/}"
depth=$(( $(grep -o '/' <<< "$relPathFromRepoRoot" | wc -l) + 2 ))
relPrefix=$(printf '../%.0s' $(seq 1 "$depth"))

safeName="${solutionName//\//_}"

# --- Auto-generated datetime header, e.g. "# 17th July, 2026 - 2:16:36 PM" ---
day_num=$(date +%-d)
case $day_num in
    1|21|31) suffix="st" ;;
    2|22)    suffix="nd" ;;
    3|23)    suffix="rd" ;;
    *)       suffix="th" ;;
esac
dateHeader="# ${day_num}${suffix} $(date +'%B, %Y • %-I:%M:%S %p')"

# --- Notes: use $5 if provided (non-interactive path), otherwise fall back to stdin (unchanged behavior) ---
if [[ -n "$notesArg" ]]; then
    notes="$notesArg"
else
    echo "📝 Enter any notes for this solution (press Ctrl-D when done, or just Ctrl-D immediately to skip):"
    notes=$(cat)
fi

cat << EOF > "${targetDir}/README.md"
${dateHeader}

${notes}

---
# Output:
![${solutionName}](${relPrefix}Outputs/week-${week}/day-${day}/${safeName}.png)

---
EOF

echo "✅ Copied into ${targetDir}"