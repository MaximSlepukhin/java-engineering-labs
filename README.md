# Java Engineering Labs

A practical collection of autonomous Java laboratories. Each laboratory answers
one engineering question, contains a reproducible experiment, and runs
independently from every other laboratory.

## Quick start

Run the first laboratory:

```bash
cd labs/java/concurrency/JV-CON-001-race-condition
docker compose up --build --abort-on-container-exit --exit-code-from demo
```

Stop the laboratory and remove its resources:

```bash
docker compose down --volumes
```

## Maintainer commands

```bash
./lab list
./lab find race
./lab path JV-CON-001
./lab run JV-CON-001
./lab validate JV-CON-001
./lab open JV-CON-001
```

The `./lab` command is intended for maintaining the collection. A GitHub visitor
only needs the instructions from the selected laboratory's README.

## Principles

- one laboratory demonstrates one observable effect;
- every laboratory has an immutable ID;
- every laboratory is an autonomous Maven project;
- Docker Compose provides the primary cross-platform launch method;
- larger projects that combine several technologies live in `scenarios/`;
- every version used in a published video is preserved with a Git tag.
- all source code, documentation, comments, metadata, CLI messages, and public
  content are written in English.

The laboratory catalog is stored in [`catalog.yaml`](catalog.yaml).

