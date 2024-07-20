FROM eclipse-temurin:18-jdk-alpine
EXPOSE 8080
ADD target/ticket*.jar ticket.jar
ENTRYPOINT ["java", "-jar", "ticket.jar"]