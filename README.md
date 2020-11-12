# microservices-springboot-kafka
## kafka-docker
## Deploying Multiple Spring Boot Microservices to Docker


## 1. Build Spring-boot apps
```
cd springboot-kafka-consumer
mvn clean install
cd ..
cd springboot-kafka-producer
mvn clean install
```

## 2. Docker-compose
```
docker-compose up -d
```

## 3. Publish (write) to streams of events (kafka)
 * Open browser or Postman (Get request)
 * Go to http://localhost:8080/{your_message}  
   Ex: http://localhost:8080/hello_world

## 4. Subscribe (read) to streams of events (kafka)
 * Go to http://localhost:8081
