FROM maven:3.8.4-jdk-11 as BUILD
WORKDIR usr/src/app
COPY . .
RUN mvn package

FROM openjdk:11
WORKDIR /app
COPY --from=BUILD usr/src/app/target/login-and-auth-0.0.1-SNAPSHOT.jar ./app.jar
CMD ["java", "-jar", "app.jar"]