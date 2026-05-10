#INSTRUCTION args {dockerfile format}
FROM eclipse-temurin:22-jdk

RUN echo "Base image is ready"

#install curl for health check
RUN apt update && apt install -y curl

#Setting a working directory
WORKDIR /app

COPY . .

RUN javac Main.java

CMD ["java", "Main"]