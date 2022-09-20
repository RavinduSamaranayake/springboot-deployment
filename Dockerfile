FROM openjdk:8
EXPOSE 8080
ADD target/springboot-deployment-0.0.1-SNAPSHOT.jar springboot-deployment-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot-deployment-0.0.1-SNAPSHOT.jar"]