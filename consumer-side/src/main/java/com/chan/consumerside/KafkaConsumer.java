package com.chan.consumerside;

import com.chan.consumerside.dto.OrderEvent;
import com.chan.consumerside.dto.UserEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "order-topic", groupId = "event-group")
    public void listen(OrderEvent orderEvent) {
        System.out.println("Received message: " + orderEvent);
    }

    @KafkaListener(topics = "payment-topic", groupId = "event-group")
    public void listenPayment(com.chan.consumerside.dto.PaymentEvent paymentEvent) {
        System.out.println("Received payment message: " + paymentEvent);
    }
    @KafkaListener(topics = "user-topic", groupId = "event-group")
    public void listenUser(UserEvent userEvent) {
        System.out.println("Received user message: " + userEvent);
    }

}
