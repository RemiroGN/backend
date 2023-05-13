FROM amazoncorretto:17-alpine-jdk
MAINTAINER NJRG
COPY target/NJRG-0.0.1-SNAPSHOT.jar NJRG-app.jar
ENTRYPOINT ["java","-jar","/NJRG-app.jar"]
