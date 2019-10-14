FROM tomcat:9.0.19-jre8

COPY /target/demo.war /usr/local/tomcat/webapps/
EXPOSE 8080
