FROM openjdk:21
#la répertoire de travail dans le conteneur
WORKDIR /app
# copier le ficher JAR de l'application dans le conteneur
COPY target/api-docker-0.0.1-SNAPSHOT.jar api-docker-0.0.1-SNAPSHOT.jar
#
ENTRYPOINT ["java","-jar","api-docker-0.0.1-SNAPSHOT.jar"]