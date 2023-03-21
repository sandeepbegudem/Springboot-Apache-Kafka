package com.codin9ninja.springboot.kafka.config;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
public class MessageController {

    public MessageController(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/publish")
    public void publish(@RequestBody MessageRequest messageRequest){
        kafkaTemplate.send("Codin9Ninja", messageRequest.getMessage());
    }
}
