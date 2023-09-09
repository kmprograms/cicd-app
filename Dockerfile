FROM amazoncorretto:17
EXPOSE 80
WORKDIR web
COPY target/app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]