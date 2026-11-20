# Java Backend Interview Roadmap

This two-year roadmap contains 104 high-priority topics for Java backend
engineering interviews and day-to-day production work. Year 1 contains 52 core
topics. Year 2 contains 52 advanced topics that deepen the same areas and
introduce more demanding production concerns. The intended pace is approximately
one topic per week, but a topic can be selected out of order when its
prerequisites are understood.

## How to use this roadmap

- Select one topic at a time.
- Use the yearly structure as guidance, not as a deadline.
- Define the specific engineering questions before writing code.
- Create one or more autonomous laboratories for observable behaviors.
- Add a larger scenario only when several topics need to be combined.
- Mark a topic as completed only when it can be explained without relying on the
  source code.
- Revisit completed topics when the related laboratory becomes outdated.

Status convention:

- `[ ]` not started
- `[~]` in progress
- `[x]` completed and understood

## Year 1 — Core Curriculum (Topics 1–52)

### Quarter 1 — Core Java and Concurrency

### 1. [ ] Object-Oriented Programming and SOLID

Encapsulation, inheritance, polymorphism, composition over inheritance, SOLID,
cohesion, coupling, and small component design.

### 2. [ ] Equality, Hashing, and Immutability

The `equals` and `hashCode` contracts, immutable objects, records, defensive
copying, and common equality mistakes.

### 3. [ ] Java Collections Framework

Lists, sets, maps, queues, ordering, iteration, collection selection, and mutable
versus immutable collections.

### 4. [ ] HashMap Internals

Buckets, collisions, resizing, load factor, treeification, mutable keys, and
`ConcurrentHashMap` fundamentals.

### 5. [ ] Generics and the Java Type System

Generic classes and methods, invariance, wildcards, PECS, bounded types, and type
erasure.

### 6. [ ] Exceptions and Error Handling

Checked and unchecked exceptions, exception hierarchy, try-with-resources,
suppressed exceptions, and application exception design.

### 7. [ ] Lambdas, Streams, and Optional

Functional interfaces, lazy evaluation, intermediate and terminal operations,
`map` versus `flatMap`, parallel streams, and appropriate use of `Optional`.

### 8. [ ] Algorithms and Complexity Fundamentals

Big O notation, arrays, strings, hash-based lookup, stacks, queues, sorting,
binary search, and common coding interview patterns.

### 9. [x] Threads and Race Conditions

Thread lifecycle, shared mutable state, race conditions, synchronization,
deadlocks, and thread safety. Initial laboratory: `JV-CON-001`.

### 10. [ ] Java Memory Model

Visibility, atomicity, ordering, happens-before relationships, `volatile`, safe
publication, and double-checked locking.

### 11. [ ] Locks, Atomics, and Concurrent Collections

`ReentrantLock`, read/write locks, CAS, atomic classes, `LongAdder`, concurrent
maps, and blocking queues.

### 12. [ ] Executors and CompletableFuture

Thread pools, pool sizing, `ExecutorService`, cancellation, `CompletableFuture`,
exception handling, and asynchronous composition.

### 13. [ ] Virtual Threads and Structured Concurrency

Platform and virtual threads, blocking operations, pinning, thread-per-request,
structured concurrency, and unsuitable workloads.

### Quarter 2 — JVM, Spring, and Testing

### 14. [ ] JVM Memory and Class Loading

Heap, stack, metaspace, object allocation, class loaders, class initialization,
references, and memory leaks.

### 15. [ ] Garbage Collection

Generations, stop-the-world pauses, G1, ZGC, GC logs, allocation pressure, and
latency versus throughput trade-offs.

### 16. [ ] JVM Profiling and Diagnostics

Java Flight Recorder, Java Mission Control, thread dumps, heap dumps,
async-profiler, CPU profiling, and allocation profiling.

### 17. [ ] Maven, Dependencies, and Build Lifecycle

Maven lifecycles, scopes, dependency mediation, transitive dependencies,
plugins, multi-module builds, Maven Wrapper, and reproducibility.

### 18. [ ] Unit and Integration Testing

JUnit 5, parameterized tests, Mockito, test doubles, integration tests,
Testcontainers, and selecting useful test boundaries.

### 19. [ ] Spring IoC and Dependency Injection

Application context, bean creation, constructor injection, scopes, lifecycle,
circular dependencies, and conditional beans.

### 20. [ ] Spring Boot Auto-Configuration

Starters, auto-configuration, configuration properties, profiles, conditional
configuration, externalized configuration, and Actuator.

### 21. [ ] Spring AOP and Proxy Mechanics

JDK dynamic proxies, CGLIB, method interception, self-invocation, private methods,
and proxy-based annotations.

### 22. [ ] Transaction Rollback Rules

`@Transactional`, commit and rollback, checked and unchecked exceptions,
`rollbackFor`, caught exceptions, and transaction boundaries.

### 23. [ ] Transaction Propagation

`REQUIRED`, `REQUIRES_NEW`, `NESTED`, rollback-only state,
`UnexpectedRollbackException`, and interaction between service methods.

### 24. [ ] SQL and Relational Data Modeling

Keys, joins, grouping, subqueries, normalization, constraints, and relational
schema design.

### 25. [ ] PostgreSQL Indexes and Query Plans

B-tree, composite, covering and partial indexes, selectivity, `EXPLAIN ANALYZE`,
sequential scans, and index scans.

### 26. [ ] Isolation Levels and Database Locking

ACID, dirty reads, non-repeatable reads, phantom reads, lost updates, optimistic
and pessimistic locking, and deadlocks.

### Quarter 3 — Persistence, APIs, and Messaging

### 27. [ ] JPA Entity Lifecycle

Transient, managed, detached and removed states, persistence context, dirty
checking, flushing, `persist`, `merge`, and transaction boundaries.

### 28. [ ] Hibernate Fetching and the N+1 Problem

Lazy and eager loading, N+1 queries, fetch joins, entity graphs,
`LazyInitializationException`, and Open Session in View.

### 29. [ ] Hibernate Performance

Batching, pagination, projections, bulk updates, query hints, JDBC batching, and
avoiding unnecessary entity loading.

### 30. [ ] Database Migrations and Schema Evolution

Flyway or Liquibase, forward-compatible migrations, zero-downtime changes,
expand-and-contract migrations, and rollback strategy.

### 31. [ ] Connection Pooling

HikariCP, pool exhaustion, connection leaks, acquisition timeouts, pool sizing,
database connection limits, and PgBouncer fundamentals.

### 32. [ ] HTTP and REST Fundamentals

HTTP methods, status codes, headers, caching, idempotent methods, content
negotiation, and connection management.

### 33. [ ] REST API Design

Resources, DTOs, pagination, filtering, validation, error responses, versioning,
and backward compatibility.

### 34. [ ] API Security Fundamentals

Authentication, authorization, password hashing, sessions, CSRF, CORS, secure
headers, and secret management.

### 35. [ ] OAuth 2.0 and JWT

Access and refresh tokens, resource servers, authorization code flow, token
validation, scopes, roles, JWT limitations, and revocation.

### 36. [ ] Redis and Caching

Cache-aside, TTL, eviction, invalidation, distributed caches, hot keys, cache
stampedes, and consistency trade-offs.

### 37. [ ] Kafka Fundamentals

Brokers, topics, partitions, producers, consumers, consumer groups, offsets, and
replication fundamentals.

### 38. [ ] Kafka Delivery and Failure Handling

At-most-once, at-least-once, duplicates, offset commits, retries, dead-letter
topics, ordering, and consumer rebalancing.

### 39. [ ] Event Schema Evolution

Backward and forward compatibility, JSON, Avro, Protobuf, schema registries,
versioning, tolerant readers, and event contract changes.

### Quarter 4 — Distributed Systems and Production

### 40. [ ] gRPC and Protocol Buffers

Protocol contracts, generated Java code, unary calls, streaming, deadlines,
status codes, interceptors, and REST versus gRPC trade-offs.

### 41. [ ] Timeouts, Retries, and Circuit Breakers

Timeout budgets, retry policies, exponential backoff, jitter, circuit breakers,
bulkheads, retry storms, and Resilience4j.

### 42. [ ] Idempotency

Idempotency keys, deduplication, repeated requests, repeated message delivery,
database constraints, response caching, and idempotent consumers.

### 43. [ ] Transactional Outbox

The dual-write problem, outbox tables, atomic database transactions, event
publishing, polling publishers, recovery, and duplicate delivery.

### 44. [ ] Change Data Capture and Debezium

Transaction logs, PostgreSQL WAL, Debezium connectors, snapshots, Kafka Connect,
schema changes, and CDC delivery guarantees.

### 45. [ ] Distributed Transactions and Saga

Local and distributed transactions, 2PC limitations, orchestration, choreography,
compensation, failure states, and saga design.

### 46. [ ] Distributed Systems Fundamentals

CAP, consistency models, availability, network partitions, clocks, partial
failures, and eventual consistency.

### 47. [ ] Architecture and Domain Boundaries

Layered, hexagonal and clean architecture, modular monoliths, DDD boundaries,
aggregates, and service coupling.

### 48. [ ] Observability

Structured logging, metrics, traces, correlation IDs, SLIs, SLOs, Prometheus,
OpenTelemetry, and production diagnosis.

### 49. [ ] Docker and Containerized Java

Images, containers, multi-stage builds, layers, configuration, resource limits,
the JVM in containers, Docker Compose, and container security.

### 50. [ ] Kubernetes Fundamentals

Pods, Deployments, Services, ConfigMaps, Secrets, readiness and liveness probes,
resource requests and limits, rolling updates, and autoscaling fundamentals.

### 51. [ ] CI/CD and Production Delivery

Git workflows, build pipelines, automated tests, artifact versioning, deployment
strategies, rollback, feature flags, blue-green deployments, and canaries.

### 52. [ ] Backend System Design

Requirements clarification, capacity estimation, API design, storage, caching,
asynchronous processing, availability, scaling, failure handling, and explaining
trade-offs.

Suggested final scenario: design and implement an order processing platform that
handles duplicate requests, reserves inventory, processes payments, publishes
events, and remains observable during failures.

## Year 2 — Advanced Curriculum (Topics 53–104)

### Modern Java and Runtime Internals

### 53. [ ] Modern Java Language Features

Records, sealed classes, pattern matching, switch expressions, text blocks, and
choosing language features that improve domain modeling.

### 54. [ ] Reflection and Annotations

Runtime metadata, reflection APIs, annotation design, framework use cases,
performance costs, and encapsulation trade-offs.

### 55. [ ] Annotation Processing and Code Generation

Compile-time annotation processing, generated sources, MapStruct-style code
generation, validation, and build integration.

### 56. [ ] Java Serialization and Data Formats

Java serialization risks, JSON mapping, custom serializers, polymorphic data,
compatibility, and secure deserialization.

### 57. [ ] Java NIO and File Processing

Buffers, channels, paths, memory-mapped files, asynchronous I/O, and processing
large files without exhausting memory.

### 58. [ ] Class Loaders and the Java Module System

Class loader hierarchy, context class loaders, class conflicts, JPMS modules,
strong encapsulation, and plugin architectures.

### 59. [ ] Bytecode and JIT Compilation

Bytecode fundamentals, interpretation, tiered compilation, inlining,
deoptimization, escape analysis, and reading JIT diagnostics.

### 60. [ ] Java Microbenchmarking with JMH

Warm-up, dead-code elimination, constant folding, forks, benchmark states,
profilers, and avoiding misleading performance measurements.

### 61. [ ] Advanced Concurrency Failure Patterns

Starvation, livelock, priority inversion, false sharing, lock contention, thread
leaks, and diagnosing concurrency failures.

### 62. [ ] Reactive Streams and Backpressure

Publishers, subscribers, subscriptions, demand control, backpressure strategies,
and the difference between asynchronous and reactive execution.

### 63. [ ] Project Reactor

`Mono`, `Flux`, operator composition, schedulers, error handling, context,
backpressure, and testing reactive pipelines.

### 64. [ ] Production Debugging Techniques

Reproducing intermittent failures, reading stack traces, live diagnostics,
thread analysis, heap analysis, log correlation, and evidence-driven debugging.

### 65. [ ] Object-Oriented Design Patterns

Strategy, factory, adapter, decorator, observer, template method, state, command,
and recognizing when a pattern adds unnecessary complexity.

### Spring and Application Development

### 66. [ ] Spring MVC Request Lifecycle

Dispatcher servlet, handler mappings, argument resolution, serialization,
filters, interceptors, exception handling, and response generation.

### 67. [ ] Spring WebFlux

Reactive request handling, event-loop execution, blocking hazards, Reactor
integration, backpressure, and choosing MVC versus WebFlux.

### 68. [ ] Validation and Error Modeling

Bean Validation, custom constraints, validation groups, field and domain errors,
Problem Details, and stable error contracts.

### 69. [ ] Spring Security Internals

Security filter chains, authentication providers, security context, method
security, authorization managers, and testing security rules.

### 70. [ ] Application Configuration and Feature Flags

Configuration precedence, environment variables, secrets, dynamic configuration,
feature flags, safe rollout, and configuration validation.

### 71. [ ] Scheduling and Batch Processing

Scheduled tasks, distributed scheduling, Spring Batch jobs, chunk processing,
restarts, idempotency, and job observability.

### 72. [ ] Spring Events and Transactional Events

Application events, synchronous and asynchronous listeners,
`TransactionalEventListener`, transaction phases, and reliability limitations.

### 73. [ ] Testing Spring Applications

Test slices, context caching, mock beans, integration boundaries, Testcontainers,
contract tests, and keeping Spring test suites fast.

### Data and Storage

### 74. [ ] Advanced SQL and Window Functions

Common table expressions, window functions, ranking, running totals, recursive
queries, lateral joins, and query readability.

### 75. [ ] PostgreSQL Statistics and Query Optimization

Planner statistics, cardinality estimation, join algorithms, cost parameters,
buffer usage, query rewrites, and diagnosing bad plans.

### 76. [ ] PostgreSQL MVCC and Vacuum

Tuple versions, transaction IDs, visibility, dead tuples, vacuum, autovacuum,
bloat, long-running transactions, and freeze.

### 77. [ ] PostgreSQL Partitioning

Range, list and hash partitioning, partition pruning, index strategy, maintenance,
and deciding when partitioning is justified.

### 78. [ ] Database Replication and Failover

Physical and logical replication, replication lag, read replicas, failover,
split-brain risk, consistency, and application behavior during failover.

### 79. [ ] Database Sharding

Shard keys, routing, rebalancing, hotspots, cross-shard operations, global IDs,
and operational complexity.

### 80. [ ] NoSQL Data Modeling

Key-value, document, wide-column and graph models, access-pattern-first design,
denormalization, consistency, and selecting a datastore.

### 81. [ ] MongoDB Fundamentals for Java Developers

Documents, indexes, aggregation, transactions, schema design, Spring Data
MongoDB, and common relational-to-document modeling mistakes.

### 82. [ ] Advanced Redis Data Structures

Hashes, sets, sorted sets, streams, HyperLogLog, Lua scripts, atomic operations,
distributed coordination, and memory trade-offs.

### Messaging and Event Processing

### 83. [ ] RabbitMQ and AMQP

Exchanges, queues, bindings, acknowledgements, routing, dead lettering,
prefetching, delivery guarantees, and RabbitMQ versus Kafka.

### 84. [ ] Kafka Broker Internals

Logs, segments, replication, in-sync replicas, leaders, controllers, retention,
compaction, and broker failure behavior.

### 85. [ ] Kafka Transactions and Exactly-Once Semantics

Idempotent producers, transactional producers, read isolation, atomic offset
commits, exactly-once boundaries, and practical limitations.

### 86. [ ] Kafka Consumer Performance

Polling, fetch configuration, partition assignment, cooperative rebalancing,
consumer lag, parallel processing, and backpressure.

### 87. [ ] Kafka Connect and Kafka Streams

Source and sink connectors, task scaling, transformations, state stores, joins,
windowing, processing guarantees, and operational concerns.

### Distributed Communication and Reliability

### 88. [ ] Service Discovery and Distributed Configuration

Client-side and server-side discovery, DNS, service registries, health checks,
configuration distribution, and stale configuration risks.

### 89. [ ] Load Balancing and API Gateways

Layer 4 and layer 7 balancing, routing algorithms, health checks, sticky sessions,
gateway responsibilities, and avoiding gateway bottlenecks.

### 90. [ ] Rate Limiting Algorithms

Fixed window, sliding window, token bucket, leaky bucket, distributed counters,
fairness, and communicating limits to clients.

### 91. [ ] Distributed Locks and Leader Election

Lock ownership, leases, fencing tokens, failure modes, Redis and database locks,
leader election, and situations where locks should be avoided.

### 92. [ ] Queues, Backpressure, and Load Shedding

Bounded queues, admission control, overload detection, load shedding, graceful
degradation, queue growth, and protecting dependencies.

### 93. [ ] Consistency Patterns

Read-your-writes, monotonic reads, quorum concepts, conflict resolution, version
vectors, eventual consistency, and user-visible trade-offs.

### 94. [ ] CQRS and Event Sourcing

Command and query separation, event logs, projections, snapshots, replay,
versioning, operational cost, and appropriate use cases.

### 95. [ ] Workflow Orchestration

Long-running processes, durable execution, timers, retries, compensation,
workflow versioning, and tools such as Camunda and Temporal.

### Infrastructure and Production Engineering

### 96. [ ] Networking Fundamentals for Backend Engineers

DNS, TCP, TLS, connection establishment, keep-alive, proxies, NAT, timeouts,
connection resets, and diagnosing network failures.

### 97. [ ] Linux Fundamentals for Java Services

Processes, signals, files, permissions, sockets, resource limits, memory, CPU,
disk diagnostics, and common operational commands.

### 98. [ ] Cloud Fundamentals

Compute, managed databases, object storage, networking, IAM, availability zones,
regions, autoscaling, and shared-responsibility principles.

### 99. [ ] Infrastructure as Code

Declarative infrastructure, Terraform state, modules, plans, drift, secrets,
review workflows, and safe infrastructure changes.

### 100. [ ] Advanced Kubernetes Workloads

StatefulSets, DaemonSets, Jobs, disruption budgets, affinity, taints, storage,
network policies, and failure-aware deployments.

### 101. [ ] Advanced Observability and Alerting

Metric cardinality, trace sampling, exemplars, recording rules, actionable alerts,
burn rates, dashboards, and controlling observability cost.

### 102. [ ] Threat Modeling and OWASP Risks

Assets, trust boundaries, attack surfaces, injection, SSRF, broken access control,
supply-chain risks, dependency scanning, and secure design reviews.

### 103. [ ] Load Testing and Capacity Planning

Workload models, throughput, latency percentiles, saturation, coordinated
omission, stress and soak tests, bottleneck analysis, and capacity estimates.

### 104. [ ] Production Incident Analysis

Incident response, mitigation, evidence collection, root-cause analysis,
postmortems, corrective actions, ownership, and communicating technical trade-offs.

## Additional specialization topics

These topics can be explored after the related roadmap areas or when required by
a target role:

- ClickHouse internals
- Kubernetes operators
- service meshes
- multi-region architecture
- search engines and Elasticsearch
- stream processing with Apache Flink
- cloud-provider-specific services
