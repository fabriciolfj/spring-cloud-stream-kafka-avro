package com.github.fabriciolfj.producercustomer.domain.integration.mensageria;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProducerSink {

    String OUT_PUT = "customer-output";

    @Output(OUT_PUT)
    MessageChannel customerOutPut();
}
