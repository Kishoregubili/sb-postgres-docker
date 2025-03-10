FROM openjdk:17-oracle
COPY target/sb-postgres-docker-0.0.1-SNAPSHOT.jar sb-postgres-docker.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","sb-postgres-docker.jar"]