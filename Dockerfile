# 1. Use Java 25 runtime image
FROM eclipse-temurin:25-jre

# 2. Set working directory inside the container
WORKDIR /app

# 3. Copy the application JAR into the container
COPY target/myapp.jar jekins-springboot-test.jar

# 4. Expose application port
EXPOSE 8082

# 5. Start the Java application
ENTRYPOINT ["java", "-jar", "jekins-springboot-test.jar"]