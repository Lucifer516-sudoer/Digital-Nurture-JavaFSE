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

SOLUTIONS_ROOT="${1:?Usage: copy_solution.sh <solutions_root> [week] [day] [solutionName]}"
week="${2:-}"
day="${3:-}"
solutionName="${4:-}"

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
        cp -v "$f" "$targetDir"
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

# --- Notes input from you, terminated with Ctrl-D (EOF) ---
echo "📝 Enter any notes for this solution (press Ctrl-D when done, or just Ctrl-D immediately to skip):"
notes=$(cat)

cat << EOF > "${targetDir}/README.md"
${dateHeader}

${notes}

---
# Output:
![${solutionName}](${relPrefix}Outputs/week-${week}/day-${day}/${safeName}.png)

---
EOF

echo "✅ Copied into ${targetDir}"