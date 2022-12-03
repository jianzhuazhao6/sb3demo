FROM openjdk:17
ARG JAR_FILE=build/libs/sb3demo-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} sb3demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","sb3demo.jar"]