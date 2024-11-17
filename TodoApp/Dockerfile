# Stage 1: Build the application
FROM eclipse-temurin:17-jdk-jammy AS builder
WORKDIR /app
# Copy pom.xml and mvnw script to the working directory
COPY TodoApp/mvnw
COPY TodoApp/pom.xml
# Ensure mvnw is executable
RUN chmod +x mvnw
# Copy the rest of the project
COPY src TodoApp/src
# Run the maven build using the wrapper
RUN ./mvnw package -DskipTests

# Stage 2: Create runtime image
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app
COPY --from=builder /app/target/TodoApp-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "TodoApp.jar"]

