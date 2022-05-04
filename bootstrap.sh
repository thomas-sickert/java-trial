#!/bin/bash

echo "Initializing DB..."
cd db || exit
./start-local.sh || exit
echo "DB initialized"

echo "Building project..."
cd ..
mvn clean install
echo "Project built"
<<<<<<< HEAD

=======
>>>>>>> a3b1b397a734610d353beb212690d7bd290da8ea
