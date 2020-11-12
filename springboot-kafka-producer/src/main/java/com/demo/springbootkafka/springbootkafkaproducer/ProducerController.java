package com.demo.springbootkafka.springbootkafkaproducer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {
    private final ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @RequestMapping(value = "/{message}", method = RequestMethod.GET)
    public ResponseEntity<String> sendMsg(@PathVariable("message") final String message){
        if(!"favicon.ico".equals(message)) {
            producerService.sendMessage(message);
        }
        return new ResponseEntity<>("pub Message Successfully!!!", HttpStatus.OK);
    }
}