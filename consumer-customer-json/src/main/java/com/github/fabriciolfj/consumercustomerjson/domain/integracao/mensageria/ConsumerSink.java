package com.github.fabriciolfj.consumercustomerjson.domain.integracao.mensageria;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface ConsumerSink {

    String INPUT_PUT = "consumerjson";

    @Input(INPUT_PUT)
    SubscribableChannel receive();
}
