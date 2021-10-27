FROM adoptopenjdk/maven-openjdk11
VOLUME /tmp
ADD target/devopsloscalidosos.jar devopsloscalidosos.jar
#RUN sh -c 'touch /devopsloscalidosos.jar'
#ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
#ENV SPRING_PROFILES_ACTIVE "docker"
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar /devopsloscalidosos.jar" ]
ENTRYPOINT ["java","-jar","devopsloscalidosos.jar","-Dserver.port=$PORT"]

