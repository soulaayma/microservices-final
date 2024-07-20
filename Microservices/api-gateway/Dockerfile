FROM openjdk:11-jdk-slim
EXPOSE 8765
ADD target/*.jar gateway.jar
ENTRYPOINT ["java","-jar","gateway.jar"]