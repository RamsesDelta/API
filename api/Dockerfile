FROM openjdk:11
VOLUME /tmp
EXPOSE 5100
ADD ./target/api-0.0.1-SNAPSHOT.jar api.jar
ENTRYPOINT ["java","-jar","/api.jar"]