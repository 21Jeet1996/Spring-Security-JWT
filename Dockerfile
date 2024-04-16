#FROM eclips-temurin:21-jdk-alpine
#WORKDIR /app
#COPY target/entity-mapping.jar entity-mapping.jar
#EXPOSE 8085
#CMD [ "java","-jar","entity-mapping.jar" ]

FROM amazoncorretto:20
ARG JAR_FILE=target/entity-mapping.jar
ADD ${JAR_FILE} entity-mapping.jar
EXPOSE 8085
ENTRYPOINT [ "java","-jar","entity-mapping.jar" ]