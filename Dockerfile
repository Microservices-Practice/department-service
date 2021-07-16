#FROM openjdk:11
#ARG JAR_FILE=target/*.jar
#RUN mvn install
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-jar","/app.jar"]
#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
#
# Package stage
#
FROM openjdk:11-jre-slim
COPY --from=build /home/app/target/department-service.jar /usr/local/lib/demo.jar
EXPOSE 9091
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]