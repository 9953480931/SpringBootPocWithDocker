FROM openjdk:8
ADD target/poc.jar poc.jar
EXPOSE 9009
ENTRYPOINT ["java","-jar","poc.jar"]
