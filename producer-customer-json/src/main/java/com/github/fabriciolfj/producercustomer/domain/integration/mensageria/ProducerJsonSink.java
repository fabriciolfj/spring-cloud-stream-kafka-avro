package com.github.fabriciolfj.producercustomer.domain.integration.mensageria;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProducerJsonSink {

    String OUT_PUT = "customer-json";

    @Output(OUT_PUT)
    MessageChannel producer();
}
