package com.chan.kafkaproducer.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentEvent {

    private String paymentId;
    private String orderId;
    private String userId;
    private double amount;
    private String currency;

}

