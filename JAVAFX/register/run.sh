#!/bin/bash

NAME=RegisterFX
OPTS='--module-path /usr/share/openjfx/lib  --add-modules javafx.controls'
CMD="javac -g:none $OPTS  $NAME.java && java -Dprism.order=sw $OPTS $NAME"
echo "$CMD"
eval "$CMD"

