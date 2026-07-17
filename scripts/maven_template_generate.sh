#!/bin/bash

echo "CWD: $(pwd)"
printf "Enter a subfolder to nest this in (leave blank for none, eg: spring-playground): "
read -r subfolder
# This was re-written by claude for obvious above reasons

targetBase="$(pwd)"
if [[ -n "$subfolder" ]]; then
    targetBase="${targetBase}/${subfolder}"
    mkdir -p "$targetBase"
fi

printf "Do you want to create the project in '%s'? [Y/n]: " "$targetBase"
read -r confirmation

createMavenQuickstart ()
{
    printf "Please provide necessary details:\n"
    printf "Group ID (eg: com.example): "
    read -r groupID
    printf "Artifact ID (eg: basic-example): "
    read -r artifactID

    echo "Verify | Group ID: $groupID | Artifact ID: $artifactID"
    printf "Shall we proceed? [Y/n]: "
    read -r confirm

    if [[ $confirm == 'Y' ]] || [[ $confirm == 'y' ]]; then
        printf "Creating the archetype...\n"
        (
            cd "$targetBase" || exit 1
            mvn archetype:generate \
                -DgroupId="$groupID" \
                -DartifactId="$artifactID" \
                -DarchetypeArtifactId="maven-archetype-quickstart" \
                -DinteractiveMode="false"
        )

        if [[ $? -eq 0 ]] && [[ -d "${targetBase}/${artifactID}" ]]; then
            echo "✅ Project created successfully at ${targetBase}/${artifactID}"
        else
            echo "❌ Maven archetype generation failed. Check the output above for errors."
            exit 1
        fi
    else
        echo "Cancelled ..."
    fi
}

if [[ $confirmation == 'Y' ]] || [[ $confirmation == 'y' ]]; then
    echo "Creating your project ..."
    createMavenQuickstart
else
    echo "Tats 👋 ..."
fi