FROM openjdk:21-jdk-slim

RUN mkdir -p /opt/df-bootcamp-arq-software/db

WORKDIR /opt/df-bootcamp-arq-software

COPY ./target/desafiofinal-0.0.1-SNAPSHOT.jar /opt/df-bootcamp-arq-software/

EXPOSE 8080

CMD ["java", "-jar", "/opt/df-bootcamp-arq-software/desafiofinal-0.0.1-SNAPSHOT.jar"]
