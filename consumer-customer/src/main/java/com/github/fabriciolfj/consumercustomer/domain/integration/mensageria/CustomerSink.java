package com.github.fabriciolfj.consumercustomer.domain.integration.mensageria;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface CustomerSink {

    String INPUT = "customer-input";

    @Input(INPUT)
    SubscribableChannel customerInput();
}
