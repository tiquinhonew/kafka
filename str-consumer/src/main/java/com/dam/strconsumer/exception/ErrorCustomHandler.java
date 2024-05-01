package com.dam.strconsumer.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.listener.ListenerExecutionFailedException;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class ErrorCustomHandler implements KafkaListenerErrorHandler {

    @Override
    public Object handleError(Message<?> message, ListenerExecutionFailedException exception) {
        log.info("EXCEPTION_HANDLER ::: Payload: {}", message.getPayload());
        log.info("EXCEPTION_HANDLER ::: Headers: {}", message.getHeaders());
        log.error("EXCEPTION_HANDLER ::: Error: {}", exception.getMessage());
        return null;
    }
}
