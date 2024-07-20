FROM openjdk:11-jdk-slim
EXPOSE 8765
ADD target/*.jar api-gateway.jar
ENTRYPOINT ["java","-jar","api-gateway.jar"]