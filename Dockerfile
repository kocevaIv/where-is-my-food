FROM adoptopenjdk/openjdk11
RUN mkdir /opt/foodtracker
COPY target/foodtracker-*[0-9T].jar /opt/foodtracker/foodtracker.jar
ENV HTTP_PORT 8080
EXPOSE ${HTTP_PORT}
WORKDIR /opt/foodtracker
CMD ["java", "-jar", "/opt/foodtracker/foodtracker.jar"]