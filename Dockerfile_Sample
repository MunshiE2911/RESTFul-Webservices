FROM maven:3.6.3-amazoncorretto-11 AS MAVEN_BUILD

MAINTAINER Ebrahim Munshi

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM amazoncorretto:11

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/restful-web-services-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "restful-web-services-0.0.1-SNAPSHOT.jar"]