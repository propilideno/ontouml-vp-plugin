#!/bin/bash

while [ $# -gt 0 ]; do

   if [[ $1 == *"--"* ]]; then
        param="${1/--/}"
        declare $param="$2"
   fi

  shift
done

gson="$appDir/com/google/code/gson/gson/2.8.5/gson-2.8.5.jar"
vpLibDir="$appDir/lib/*"
vpOrmlibDir="$appDir/ormlib/*"

classpath="$pluginDir:$gson:$vpLibDir:$vpOrmlibDir"
java=$(which java)

cd "$appDir/bin" || return

echo "$java -classpath ${classpath} RV debug"
$java -classpath "$classpath" -Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=5005,suspend=n RV debug