FROM openjdk:15
EXPOSE 8080
ADD ./tmp/target/devopsloscalidosos.jar devopsloscalidosos.jar
ENTRYPOINT ["java","-jar","devopsloscalidosos.jar"]