package com.github.fabriciolfj.consumercustomer.domain.integration.consumer;

import com.github.fabriciolfj.consumercustomer.domain.integration.mensageria.CustomerSink;
import com.github.fabriciolfj.schema.CustomerSchema;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class CustomerConsumer {

    @StreamListener(CustomerSink.INPUT)
    public void consumer(final CustomerSchema schema) {
        log.info("Consumer: " + schema.toString());
    }
}
