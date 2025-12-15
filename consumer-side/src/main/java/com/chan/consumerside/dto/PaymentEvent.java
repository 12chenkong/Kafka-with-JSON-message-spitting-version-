package com.chan.consumerside.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class PaymentEvent {
    private String paymentId;
    private String orderId;
    private String userId;
    private double amount;
    private String currency;
}
