#!/usr/bin/env bash
set -euo pipefail

cleanup() {
  docker compose down --volumes --remove-orphans
}

trap cleanup EXIT

docker compose up --build --abort-on-container-exit --exit-code-from demo

