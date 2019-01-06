#Build java web app container image
FROM ubuntu:14.04
MAINTAINER chen "1792266893@qq.com"

#Make java and tomcat install directory
RUN mkdir /usr/local/java
RUN mkdir /usr/local/tomcat

#Copy jre and tomcat into image
ADD jdk1.8.0_191 /usr/local/java/
ADD apache-tomcat-7.0.92 /usr/local/tomcat/

ENV PATH $PATH:/usr/local/java/bin

#Expose http port
EXPOSE 8080

CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
