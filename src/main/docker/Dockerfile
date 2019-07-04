FROM openjdk:8
VOLUME /tmp
ADD target/micro-calculator-service-0.0.1-SNAPSHOT.jar calculatorService.jar
RUN bash -c 'touch /calculatorService.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/calculatorService.jar"]