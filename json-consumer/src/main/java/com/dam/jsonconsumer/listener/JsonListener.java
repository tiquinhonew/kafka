package com.dam.jsonconsumer.listener;

import com.dam.jsonconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.sleep;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "create-group", containerFactory = "jsonContainerFactory")
    public void antiFraud(@Payload Payment payment) {
        sleep(2000);
        log.info("JSON_LISTENER ::: Recebi o pagamento {}", payment.toString());

        sleep(2000);
        log.info("JSON_LISTENER ::: Validando fraude... ");

        sleep(3000);
        log.info("JSON_LISTENER ::: Compra aprovada... ");
    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "pdf-group", containerFactory = "jsonContainerFactory")
    public void pdfGenerator(@Payload Payment payment) {
        sleep(3000);
        log.info("JSON_LISTENER ::: Gerando PDF de id {}... ", payment.getId());
    }

    @SneakyThrows
    @KafkaListener(topics = "payment-topic", groupId = "email-group", containerFactory = "jsonContainerFactory")
    public void sendEmail() {
        sleep(3000);
        log.info("JSON_LISTENER ::: Enviando email de confirmação... ");
    }
}
