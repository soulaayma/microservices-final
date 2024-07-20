FROM eclipse-temurin:18-jdk-alpine
EXPOSE 8081
ADD target/event*.jar event.jar
ENTRYPOINT ["java", "-jar", "event.jar"]