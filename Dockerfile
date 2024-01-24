FROM openjdk
COPY . .
WORKDIR /src
CMD ["java", "Main", "${PARAMS}"]