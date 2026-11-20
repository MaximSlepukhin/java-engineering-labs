$ErrorActionPreference = "Stop"

try {
    docker compose up --build --abort-on-container-exit --exit-code-from demo
}
finally {
    docker compose down --volumes --remove-orphans
}

