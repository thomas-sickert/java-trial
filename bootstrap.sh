#!/bin/bash

echo "Initializing DB..."
cd db || exit
./start-local.sh
echo "DB initialized"
