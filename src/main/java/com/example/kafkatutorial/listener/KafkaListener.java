package com.example.kafkatutorial.listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(
            topics = "amigoscode",
            groupId = "foo"
    )
    void listener(String data) {
        System.out.println("Listener received: " + data + " :)");
    }

}
