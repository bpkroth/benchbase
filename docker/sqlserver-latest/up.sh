#!/bin/bash

set -eu

docker compose up -d

network=$(docker container inspect sqlserver | jq -r .[].HostConfig.NetworkMode)

# Also setup the database for use with the sample configs.
# See Also: .github/workflows/maven.yml

function run_sqlcmd_in_docker() {
    set -x
    docker run --rm --network=$network --entrypoint /opt/mssql-tools/bin/sqlcmd mcr.microsoft.com/mssql-tools:latest "$@"
    set +x
}

# Cleanup database
run_sqlcmd_in_docker -U sa -P SApassword1 -S sqlserver -b -Q "DROP DATABASE IF EXISTS benchbase;"

# Setup database
run_sqlcmd_in_docker -U sa -P SApassword1 -S sqlserver -b -Q "CREATE DATABASE benchbase;"

# Setup login
run_sqlcmd_in_docker -U sa -P SApassword1 -S sqlserver -Q "CREATE LOGIN benchuser01 WITH PASSWORD='P@ssw0rd';"

# Setup access
run_sqlcmd_in_docker -U sa -P SApassword1 -S sqlserver -b -Q "USE benchbase; CREATE USER benchuser01 FROM LOGIN benchuser01; EXEC sp_addrolemember 'db_owner', 'benchuser01';"
