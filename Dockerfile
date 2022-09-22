FROM openjdk:8
EXPOSE 8080
ADD target/devops-docker-integration.jar devops-docker-integration.jar
ENTRYPOINT ["java","-jar","/devops-docker-integration.jar"]
