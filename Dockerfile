FROM openjdk:18

WORKDIR /app

COPY . /app

RUN ./mvnw -B clean package

EXPOSE 8083

CMD ["java", "-jar", "target/apiFinancas-0.0.1-SNAPSHOT.jar"]