FROM 172.17.5.228:5000/test/java8_jdk:v1
ARG JAVA_OPTION='-Xms1024m -Xmx1024m -Duser.timezone=GMT+8'
EXPOSE 8813
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' > /etc/timezone
ADD target/*.jar /opt/*.jar
ENV JAVA_OPTION ${JAVA_OPTION}
CMD java  $JAVA_OPTION -jar /opt/*.jar