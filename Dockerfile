FROM openjdk:23-jdk-oracle

COPY ./build/libs/english-learning-app-0.0.1-SNAPSHOT.jar /root
WORKDIR ./root

ENTRYPOINT ["java", "-jar", "english-learning-app-0.0.1-SNAPSHOT.jar"]
