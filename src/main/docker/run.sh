#!/bin/sh
java -Djava.security.egd=file:/dev/./urandom \
     -jar /usr/local/deploy/@project.build.finalName@.jar