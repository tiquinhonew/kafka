package com.dam.strconsumer.listeners;

import com.dam.strconsumer.custom.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @SneakyThrows
    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message) {
        log.info("CREATE ::: Received message: {}", message);
        throw new IllegalArgumentException("Error on create");
    }

    @StrConsumerCustomListener(groupId = "group-1")
    public void log(String message) {
        log.info("LOG ::: Received message: {}", message);
        throw new IllegalArgumentException("Error on log");
    }

    @KafkaListener(topics = "str-topic", groupId = "group-2", containerFactory = "validMessageContainerFactory")
    public void history(String message) {
        log.info("HISTORY ::: Received message: {}", message);
    }
}
