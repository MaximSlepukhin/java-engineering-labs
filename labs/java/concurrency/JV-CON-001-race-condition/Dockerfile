FROM maven:3.9.9-eclipse-temurin-21 AS build
WORKDIR /workspace
COPY pom.xml ./
COPY src ./src
RUN mvn --batch-mode verify

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /workspace/target/classes ./classes
ENTRYPOINT ["java", "-cp", "classes", "com.maximslepukhin.labs.concurrency.RaceConditionDemo"]

