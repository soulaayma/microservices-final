FROM eclipse-temurin:18-jdk-alpine
EXPOSE 8761
ADD target/eureka*.jar EurekaSever.jar
ENTRYPOINT ["java", "-jar", "EurekaSever.jar"]