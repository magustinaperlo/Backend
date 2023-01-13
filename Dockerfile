FROM FROM openjdk:19-ea-jdk-slim

MAINTAINER maa

COPY target/maa-0.0.1-SNAPSHOT.jar maa-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/maa-0.0.1-SNAPSHOT.jar"]
