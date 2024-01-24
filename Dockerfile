FROM openjdk
WORKDIR togatry
COPY . .
WORKDIR /togatry/src
CMD ["java", "Main.java"]
