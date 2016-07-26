FROM develar/java:8u45

RUN mkdir /app
RUN mkdir /app/data
COPY application/build/libs/application.jar /app/
COPY application/build/dependencies /app/dependencies
WORKDIR /app
ENTRYPOINT []
CMD java -classpath "application.jar:dependencies/*" com.github.tsar_industries.poke_radar.application.MyApplication server
EXPOSE 8080 8081 5005

