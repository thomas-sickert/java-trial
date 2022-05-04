#!/bin/bash

docker run -p 5455:5432 -e POSTGRES_USER=dad -e POSTGRES_PASSWORD=jokes -e POSTGRES_DB=dadjokes -v "$(pwd)/init:/docker-entrypoint-initdb.d" -d postgres
