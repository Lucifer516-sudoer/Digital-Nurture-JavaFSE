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

SOLUTIONS_ROOT="${1:?Usage: copy_solution.sh <solutions_root>}"

echo "CWD: $(pwd)"

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
    printf "Enter the dir name for the solution: [Eg: sl4j-handson-001] "
    read -r solutionName
    [[ -n "$solutionName" ]] && break
    echo "⚠️  Solution name cannot be empty."
done

targetDir="${SOLUTIONS_ROOT}/week-${week}/day-${day}-${solutionName}"
echo "Target Directory: ${targetDir}"
printf "Shall we proceed: [Y/n] "
read -r confirmation

if [[ $confirmation == 'Y' ]] || [[ $confirmation == 'y' ]]; then
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

    touch "${targetDir}/README.md"
    echo "✅ Copied into ${targetDir}"
else
    echo "Tats ..."
fi