#!/bin/bash
cd /home/kavia/workspace/code-generation/recipehub-34932-dbbd8a57/recipehub_frontend
./gradlew lint
LINT_EXIT_CODE=$?
if [ $LINT_EXIT_CODE -ne 0 ]; then
   exit 1
fi

