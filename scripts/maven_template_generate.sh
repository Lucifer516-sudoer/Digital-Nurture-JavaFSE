#!/bin/bash

echo "CWD: $(pwd)"
printf "Do you want to create the project in here? [Y/n]: "
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
        mvn archetype:generate \
            -DgroupId="$groupID" \
            -DartifactId="$artifactID" \
            -DarchetypeArtifactId="maven-archetype-quickstart" \
            -DinteractiveMode="false"

        # shellcheck disable=SC2181
        if [[ $? -eq 0 ]] && [[ -d "$artifactID" ]]; then
            echo "✅ Project created successfully at $(pwd)/$artifactID"
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