FROM openjdk:latest

COPY build/libs/jenkins-pipeline-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]