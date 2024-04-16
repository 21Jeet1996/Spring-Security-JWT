FROM eclips-temurin:21-jdk-alpine
WORKDIR /app
COPY target/entity-mapping.jar entity-mapping.jar
EXPOSE 8085
CMD [ "java","-jar","entity-mapping.jar" ]