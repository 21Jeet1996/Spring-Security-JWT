FROM eclips-temurin:17-jdk-alpine
WORKDIR /app
COPY target/EntityMapping-0.0.1-SNAPSHOT.jar EntityMapping-0.0.1-SNAPSHOT.jar
EXPOSE 8085
CMD [ "java","-jar","EntityMapping-0.0.1-SNAPSHOT.jar" ]