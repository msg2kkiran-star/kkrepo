# Step 1: Use a lightweight base image with Java
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy the Spring Boot JAR file into the image
# (Replace 'app.jar' with your JAR filename if different)
COPY target/*.jar app.jar

# Step 4: Expose the port your Spring Boot app runs on
EXPOSE 8080

# Step 5: Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]
