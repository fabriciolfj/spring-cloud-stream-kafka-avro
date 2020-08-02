package com.github.fabriciolfj.producercustomer.domain.integration.producer;

import com.github.fabriciolfj.producercustomer.api.dto.CustomerDTO;
import com.github.fabriciolfj.producercustomer.domain.integration.mensageria.ProducerJsonSink;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class CustomerJsonProducer {

    private final ProducerJsonSink sink;

    public void send(final CustomerDTO dto) {
        var message = MessageBuilder.withPayload(dto).build();
        sink.producer().send(message);
        log.info("Send message: " + dto.toString());
    }
}
