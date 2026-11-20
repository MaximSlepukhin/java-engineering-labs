#!/usr/bin/env bash
set -euo pipefail

LAB_DIR="${1:-}"

if [[ -z "$LAB_DIR" || ! -d "$LAB_DIR" ]]; then
  echo "Usage: validate-lab.sh <laboratory-directory>" >&2
  exit 1
fi

required_files=(
  README.md
  metadata.yaml
  pom.xml
  mvnw
  mvnw.cmd
  compose.yaml
  Dockerfile
)

for file in "${required_files[@]}"; do
  if [[ ! -f "$LAB_DIR/$file" ]]; then
    echo "Missing required file: $file" >&2
    exit 1
  fi
done

echo "Building and testing $(basename "$LAB_DIR")..."
(cd "$LAB_DIR" && ./mvnw --batch-mode verify)

echo "Validating Docker Compose configuration..."
(cd "$LAB_DIR" && docker compose config --quiet)

echo "Laboratory is valid."

