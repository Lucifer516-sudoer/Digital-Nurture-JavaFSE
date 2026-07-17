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
printf "Enter the week number: [Eg: 01] "
read -r week

printf "Enter the day number: [Eg: 33] "
read -r day

printf "Enter the dir name for the solution: [Eg: sl4j-handson-001] "
read -r solutionName

targetDir="${SOLUTIONS_ROOT}/week-${week}/day-${day}-${solutionName}"
echo "Target Directory: ${targetDir}"
printf "Shall we proceed: [Y/n] "
read -r confirmation

if [[ $confirmation == 'Y' ]] || [[ $confirmation == 'y' ]]; then
    mkdir -p "$targetDir"

    shopt -s nullglob
    javaFiles=(*.java)
    shopt -u nullglob

    if [[ -f pom.xml ]]; then
        cp -v pom.xml "$targetDir"
    else
        echo "⚠️  No pom.xml found in $(pwd), skipping."
    fi

    if [[ ${#javaFiles[@]} -gt 0 ]]; then
        cp -v "${javaFiles[@]}" "$targetDir"
    else
        echo "⚠️  No .java files found in $(pwd), skipping."
    fi

    touch "${targetDir}/README.md"
    echo "✅ Copied into ${targetDir}"
else
    echo "Tats ..."
fi