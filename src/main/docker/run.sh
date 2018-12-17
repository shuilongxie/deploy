#!/bin/sh

echo "++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"
echo "$MY_HELLO,$MY_KEY"

java -Djava.security.egd=file:/dev/./urandom \
     -jar /usr/local/deploy/@project.build.finalName@.jar