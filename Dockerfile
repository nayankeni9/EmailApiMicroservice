FROM maven:3.6.0-jdk-8-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#FROM java:8
#WORKDIR /
#ADD target/emailapi-0.0.1-SNAPSHOT.jar app.jar
#CMD java -jar app.jar

FROM openjdk:8-slim
COPY --from=build /home/app/target/emailapi-0.0.1-SNAPSHOT.jar /usr/local/lib/demo.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/demo.jar"]