package com.demo.springbootkafka.springbootkafkaconsumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {
    private String resMsg = "Hello";

    @KafkaListener(topics = "springboot-kafka-demo", groupId = "my-kafka-springboot")
    public void getMessage(String msg){
        System.out.println("kafka: " + msg);
        this.resMsg = msg;
    }

    public String receiveMessage(){
        return this.resMsg;
    }
}
