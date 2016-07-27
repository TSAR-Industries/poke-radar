# poke-radar
Hipchat integration to announce Pokémon spawns at your house/workplace

## Running:
    ./build-and-run.sh

## Finding outdated dependencies
    ./gradlew dependencyUpdates

## Updating gradle wrapper version
    ./gradlew wrapper --gradle-version 2.14.1
Gradle will change the wrapper from bin to all, change back to all

## If the gradle task buildImage fails you might need this
* Add -H tcp://127.0.0.1:2375 to the docker process (like DOCKER_OPTS or systemd)
* Add the env variable DOCKER_HOST=tcp://127.0.0.1:2375
