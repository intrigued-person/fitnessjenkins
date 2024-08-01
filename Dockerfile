FROM openjdk:18
WORKDIR /app
COPY ./target/fitness-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "fitness-0.0.1-SNAPSHOT.jar"]
