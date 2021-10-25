FROM openjdk:15
EXPOSE 8080
ADD ./target/devopsloscalidosos.jar devopsloscalidosos.jar
ENTRYPOINT ["java","-jar","devopsloscalidosos.jar"]