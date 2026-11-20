# JV-CON-001 — Race Condition

- A race condition appears when the result depends on thread interleaving.
- `value++` is a read-modify-write sequence, not an atomic operation.
- `volatile` provides visibility but does not make increments atomic.
- Use synchronization, locks or atomic classes for shared mutable state.
- The laboratory intentionally widens the race window to make data loss visible.
- Run: `docker compose up --build`.
- Source: `labs/java/concurrency/JV-CON-001-race-condition`.

