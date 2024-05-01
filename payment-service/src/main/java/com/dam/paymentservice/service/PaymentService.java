package com.dam.paymentservice.service;

import com.dam.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
