FROM eclipse-temurin:18-jdk-alpine
EXPOSE 8181
ADD target/config*.jar config-server.jar
ENTRYPOINT ["java", "-jar", "config-server.jar"]