FROM java:8-jre
MAINTAINER springBootAdmin lafangyuan

ADD ./target/actuator-0.0.1-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/actuator-0.0.1-SNAPSHOT.jar"]

EXPOSE 5000