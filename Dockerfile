FROM tomcat:9-jre8
RUN apt-get update && apt-get install librrds-perl rrdtool -y
COPY . /app
ENTRYPOINT [ "java","-jar","/app/build/libs/spring-project-0.1.0.jar" ]