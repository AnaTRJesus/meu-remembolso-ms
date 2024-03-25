FROM openjdk:17-jdk-alpine
COPY target/meu-reembolso-0.0.1-SNAPSHOT.jar meu-reembolso.jar
ENTRYPOINT ["java","-jar","/meu-reembolso.jar"]