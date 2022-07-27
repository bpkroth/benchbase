#!/bin/bash

set -eu

scriptdir=$(dirname "$(readlink -f "$0")")
cd "$scriptdir"
. ./common-env.sh
rootdir=$(readlink -f "$scriptdir/../../")
cd "$rootdir"

set -x
docker build --progress=plain \
    --build-arg="http_proxy=${http_proxy:-}" --build-arg="https_proxy=${https_proxy:-}" \
    --build-arg MAVEN_OPTS="-Dhttp.proxyHost=${http_proxy_host} -Dhttp.proxyPort=${http_proxy_port} -Dhttps.proxyHost=${https_proxy_host} -Dhttps.proxyPort=${https_proxy_port}" \
    --build-arg BENCHBASE_PROFILES="${BENCHBASE_PROFILES}" \
    --build-arg CONTAINERUSER_UID="$CONTAINERUSER_UID" --build-arg CONTAINERUSER_GID="$CONTAINERUSER_GID" \
    -t "$image_tags" -f ./docker/benchbase/devcontainer/Dockerfile .
set +x
