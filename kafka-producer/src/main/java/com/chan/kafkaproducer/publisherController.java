package com.chan.kafkaproducer;


import com.chan.kafkaproducer.dto.OrderEvent;
import com.chan.kafkaproducer.dto.PaymentEvent;
import com.chan.kafkaproducer.dto.UserEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publisher")
public class publisherController {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    public publisherController(KafkaTemplate<String, Object> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/order")
    public ResponseEntity<?>sendOrderEnvent(@RequestBody OrderEvent orderEvent){
        kafkaTemplate.send("order-topic",orderEvent);
        return ResponseEntity.ok("Order event published");
    }

    @PostMapping("/payment")
    public ResponseEntity<?>sendPaymentEvent(@RequestBody PaymentEvent paymentEvent) {
        kafkaTemplate.send("payment-topic", paymentEvent);
        return ResponseEntity.ok("Payment event published");
    }

    @PostMapping("/user")
    public ResponseEntity<?>sendUserEvent(@RequestBody UserEvent userEvent) {
        kafkaTemplate.send("user-topic", userEvent);
        return ResponseEntity.ok("User event published");
    }

}
