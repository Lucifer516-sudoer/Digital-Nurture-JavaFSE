#!/bin/bash

echo "CWD: $(pwd)"
printf "Do you want to create the project in here? [Y/n]: "
read -r confirmation

createMavenQuickstart ()
{
    printf "Please provide neccessary details:\n"
    printf "Group ID: (eg: com.example):? "
    read -r groupID
    printf "Artificact ID: (eg: basic-example):? "
    read -r artifactID
    # I am just going to create the maven-archetype-quickstart project as the template, i cant think too much just for this
    echo "Verify | Group ID: $groupID | nArtifact ID: $artifactID"
    echo "Shall we Proceed (Y/n): ?"
    read -r confirm
    if [[ $confirm == 'Y' ]] || [[ $confirm == 'y' ]]; then
        printf "Creating the archetype\n"
        mvn archetype:generate -DgroupId="$groupID" -DartifactId="$artifactID" -DarchetypeArtifactId="maven-archetype-quickstart" -DinteractiveMode="false"
        echo "Check whether created or not, right now I dont know to do that"
    else
        echo "Tats ..."
    fi
}

if [[ $confirmation == 'Y' ]] || [[ $confirmation == 'y' ]]; then
    echo "Creating your project ..."
    createMavenQuickstart
else
    echo "Tats 👋 ..."
fi