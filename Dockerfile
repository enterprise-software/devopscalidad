FROM fabric8/java-alpine-openjdk8-jre
VOLUME /tmp
ADD target/devsecopslocalidosos.jar devsecopslocalidosos.jar
RUN sh -c 'touch /devsecopslocalidosos.jar'
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
ENV SPRING_PROFILES_ACTIVE "docker"
#EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dserver.port=$PORT -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar /devsecopslocalidosos.jar" ]