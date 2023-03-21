package com.codin9ninja.springboot.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "Codin9Ninja",
    groupId = "Kafka Listener"
    )
    void Listener(String data){
        System.out.println("Listener received: " + data + "🎯");
    }
}
