FROM openjdk:17-jdk-alpine
COPY target/meu-reembolso-0.0.1-SNAPSHOT.jar meu-reembolso.jar
COPY newrelic/newrelic-agent-8.9.1.jar newrelic-agent-8.9.1.jar
COPY newrelic.yml newrelic.yml

ENTRYPOINT ["java","-jar","-javaagent:newrelic-agent-8.9.1.jar","/meu-reembolso.jar"]