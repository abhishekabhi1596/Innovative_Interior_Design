FROM openjdk:17

ADD target/Innovative_Interior-0.0.1-SNAPSHOT.jar Innovative_Interior-0.0.1-SNAPSHOT.jar

EXPOSE 8282

ENTRYPOINT ["java","-jar", "Innovative_Interior-0.0.1-SNAPSHOT.jar"]
