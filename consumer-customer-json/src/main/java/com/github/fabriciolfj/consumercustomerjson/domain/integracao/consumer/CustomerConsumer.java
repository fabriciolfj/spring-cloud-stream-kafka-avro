package com.github.fabriciolfj.consumercustomerjson.domain.integracao.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fabriciolfj.consumercustomerjson.domain.integracao.dto.CustomerDTO;
import com.github.fabriciolfj.consumercustomerjson.domain.integracao.mensageria.ConsumerSink;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class CustomerConsumer {

    @StreamListener(ConsumerSink.INPUT_PUT)
    public void receive(final CustomerDTO dto) throws JsonProcessingException {
       // var mapper = new ObjectMapper();
        //var dto = mapper.readValue(value, CustomerDTO.class);
        log.info("Receive = " + dto.toString());
    }
}
