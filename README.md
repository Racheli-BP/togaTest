## togaTest

### to run the docker with arguments run:
docker run -e PARAMS=<array params> togatest:latest
#### the output - the index of the peak will be printed.

### commands that are done in the github action:
docker run -e PARAMS="1 2 3" togatest:latest  
docker run -e PARAMS="4 6 5" togatest:latest  
docker run -e PARAMS="1 2 1" togatest:latest  

### outputs of theese commands have to be: 2  1  1
because theese are the peak indexes of theese arrays
