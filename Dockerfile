FROM adoptopenjdk/maven-openjdk11
VOLUME /tmp
ADD target/devopsloscalidosos.jar devopsloscalidosos.jar
ENTRYPOINT ["java","-jar","devopsloscalidosos.jar","-Dserver.port=$PORT"]

