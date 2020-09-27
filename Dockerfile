FROM openjdk:8
WORKDIR /app
COPY build/libs/*.jar application.jar
CMD java -jar application.jar
