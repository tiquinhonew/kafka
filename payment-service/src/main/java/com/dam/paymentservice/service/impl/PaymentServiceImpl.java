package com.dam.paymentservice.service.impl;

import com.dam.paymentservice.model.Payment;
import com.dam.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

    private final KafkaTemplate<String, Serializable> kafkaTemplate;

    @SneakyThrows
    @Override
    public void sendPayment(Payment payment) {
        log.info("PAYMENT_SERVICE_IMPL ::: Recebi o pagamento: {}", payment);
        Thread.sleep(1000);

        log.info("PAYMENT_SERVICE_IMPL ::: Enviando pagamento");
        kafkaTemplate.send("payment-topic", payment);
    }
}
