# JV-CON-001 — Race Condition

A minimal Java 21 experiment showing how concurrent read-modify-write operations
lose updates and how synchronization fixes the problem.

## Question

What happens when several threads increment the same ordinary `int` without
synchronization?

## Requirements

- Docker with Docker Compose
- approximately 512 MB of free memory

No locally installed Java or Maven is required for the primary launch method.

## Run

From this directory:

```bash
docker compose up --build --abort-on-container-exit --exit-code-from demo
```

Alternatively:

```bash
./run.sh
```

On Windows PowerShell:

```powershell
.\run.ps1
```

## Expected result

The unsafe counter should finish below the expected value, while the synchronized
counter should match it exactly:

```text
Expected increments:       80000
Unsafe counter result:     10000
Synchronized result:       80000

RACE CONDITION OBSERVED: updates were lost.
SYNCHRONIZED COUNTER PASSED: no updates were lost.
LAB RESULT: PASSED
```

The exact unsafe value depends on thread scheduling.

## How it works

`UnsafeCounter.increment()` performs three separate actions: read the current
value, calculate the next value and write it back. Several threads can read the
same value before any of them writes the result. The demonstration introduces a
small delay between reading and writing to make this interleaving easy to see.

`SynchronizedCounter.increment()` protects the complete operation with a monitor,
so only one thread changes the value at a time.

## Try changing

- Change `THREAD_COUNT` and `INCREMENTS_PER_THREAD`.
- Remove the deliberate delay from `UnsafeCounter`.
- Replace synchronization with `AtomicInteger`.
- Try marking the unsafe value as `volatile` and observe that the increment is
  still not atomic.

## Limitations

The delay deliberately amplifies the race. It is a teaching mechanism, not a
performance benchmark. Use JMH for reliable Java microbenchmarks.

## Local development

The Maven Wrapper is included:

```bash
./mvnw verify
java -cp target/classes com.maximslepukhin.labs.concurrency.RaceConditionDemo
```

## Cleanup

```bash
docker compose down --volumes
```

