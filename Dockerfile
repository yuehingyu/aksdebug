FROM openjdk:8-jdk-alpine
LABEL maintainer="yu.yuehing@gmail.com"
ADD   /target/aksdebug-0.0.1-SNAPSHOT.jar aksdebug_app.jar
ENTRYPOINT ["java", "-jar","/aksdebug_app.jar"]