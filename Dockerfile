FROM openjdk:15
# Add Maintainer Info
LABEL maintainer="durangoriveragmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
ARG JAR_FILE=build/libs/devopsloscalidosos.jar

# Add the application's jar to the container
ADD ${JAR_FILE} ${directo}

ENTRYPOINT ["java","-jar","devopsloscalidosos.jar"]