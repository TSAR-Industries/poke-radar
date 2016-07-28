# poke-radar
Hipchat integration to announce Pokémon spawns at your house/workplace  
Build status: [![Build Status](https://travis-ci.org/TSAR-Industries/poke-radar.svg?branch=master)](https://travis-ci.org/TSAR-Industries/poke-radar)

## Running:
    ./build-and-run.sh
you can test the integration with the pokemongo severs by running:
    http://localhost:8080/user/get?username=x&password=x

## Finding outdated dependencies
    ./gradlew dependencyUpdates

## Updating gradle wrapper version
    ./gradlew wrapper --gradle-version 2.14.1
Gradle will change the wrapper from bin to all, change back to all

## If the gradle task buildImage fails you might need this
* Add -H tcp://127.0.0.1:2375 to the docker process (like DOCKER_OPTS or systemd)
* Add the env variable DOCKER_HOST=tcp://127.0.0.1:2375
