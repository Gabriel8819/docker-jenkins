FROM ubuntu-java
RUN apt-get install maven -y
COPY . .
EXPOSE 8080
CMD "mvn verify"








