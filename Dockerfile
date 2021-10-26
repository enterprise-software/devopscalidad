FROM fabric8/java-alpine-openjdk8-jre
VOLUME /tmp
COPY "./target/devsecopslocalidosos.0.0.1-SNAPSHOT.jar" "devsecopslocalidosos.0.0.1-SNAPSHOT.jar"
#COPY "target/devsecopslocalidosos.0.0.1-SNAPSHOT.jar" "devsecopslocalidosos.0.0.1-SNAPSHOT.jar"
#RUN sh -c 'touch /devsecopslocalidosos.0.0.1-SNAPSHOT.jar'
#ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
ENV SPRING_PROFILES_ACTIVE "docker"
#EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java", "-jar", "devsecopslocalidosos.0.0.1-SNAPSHOT.jar", "-Dserver.port=$PORT", "-Djava.security.egd=file:/dev/./urandom", "-Dspring.profiles.active=$SPRING_PROFILES_ACTIVE" ]
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dserver.port=$PORT -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar devsecopslocalidosos.0.0.1-SNAPSHOT.jar" ]