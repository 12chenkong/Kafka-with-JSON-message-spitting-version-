package com.chan.consumerside;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "order-topic", groupId = "event-group",containerFactory = "kafkaListenerContainerFactory")
    public void listen(Object message) {
        System.out.println("Received message: " + message);
    }
}
