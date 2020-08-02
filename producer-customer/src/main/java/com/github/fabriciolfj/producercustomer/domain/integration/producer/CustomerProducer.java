package com.github.fabriciolfj.producercustomer.domain.integration.producer;


import com.github.fabriciolfj.producercustomer.domain.integration.mensageria.ProducerSink;
import com.github.fabriciolfj.schema.CustomerSchema;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class CustomerProducer {

    private final ProducerSink producerSink;

    public void send(final CustomerSchema schema) {
        var message = MessageBuilder.withPayload(schema).build();
        producerSink.customerOutPut().send(message);
        log.info("Message send success");
    }
}
