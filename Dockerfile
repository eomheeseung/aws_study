# Use the official OpenJDK image as a base image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the JAR file into the container
# 주목해야 될 부분!!
COPY build/libs/aws_study-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port that the Spring Boot app will run on
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "app.jar"]