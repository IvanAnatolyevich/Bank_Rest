FROM openjdk:21-jdk-slim
WORKDIR /app
COPY target/ app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]