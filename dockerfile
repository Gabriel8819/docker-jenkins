FROM ubuntu-java
RUN	apt-get update && apt-get install openjdk-11-jdk -y && apt-get install mysql-client -y
COPY target/app.jar app.jar
COPY exec.sh exec.sh
EXPOSE 8080
ENV customenv=customvalueenv








