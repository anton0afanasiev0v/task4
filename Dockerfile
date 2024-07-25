FROM amazoncorretto:21-alpine3.18-jdk
RUN apk update && apk add curl
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} auth.jar
ENTRYPOINT ["java","-jar","/auth.jar"]
