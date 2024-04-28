package com.dam.strconsumer.listeners;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @KafkaListener(topics = "str-topic", groupId = "group-1", containerFactory = "srtContainerFactory")
    public void create(String message) {
        log.info("CREATE ::: Received message: {}", message);
    }

    @KafkaListener(topics = "str-topic", groupId = "group-1", containerFactory = "srtContainerFactory")
    public void log(String message) {
        log.info("LOG ::: Received message: {}", message);
    }
}
