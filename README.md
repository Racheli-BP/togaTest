## togaTest
# commands:
docker run -e PARAMS="1 2 3" togatest:latest
docker run -e PARAMS="4 6 5" togatest:latest
docker run -e PARAMS="1 2 1" togatest:latest

# outputs need to be: 2  1  1
because theese are the peek indexes of theese arrays
