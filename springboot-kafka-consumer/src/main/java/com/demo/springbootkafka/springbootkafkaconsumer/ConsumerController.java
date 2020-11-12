package com.demo.springbootkafka.springbootkafkaconsumer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    private final ConsumerService consumerService;

    public ConsumerController(ConsumerService consumerService) {
        this.consumerService = consumerService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> getMsg(){
        String res = consumerService.receiveMessage();
        return new ResponseEntity<>(res, HttpStatus.OK);
    }
}
