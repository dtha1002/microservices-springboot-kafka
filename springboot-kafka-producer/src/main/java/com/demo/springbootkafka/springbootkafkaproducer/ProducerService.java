package com.demo.springbootkafka.springbootkafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {
    public final static String TOPIC = "springboot-kafka-demo";

    @Autowired
    public KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String msg){
        System.out.println("kafka: " + msg);
        this.kafkaTemplate.send(TOPIC, msg);
    }
}
