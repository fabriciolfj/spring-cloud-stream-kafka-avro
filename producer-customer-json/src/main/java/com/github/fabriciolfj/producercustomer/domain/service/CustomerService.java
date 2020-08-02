package com.github.fabriciolfj.producercustomer.domain.service;

import com.github.fabriciolfj.producercustomer.api.dto.CustomerDTO;
import com.github.fabriciolfj.producercustomer.domain.integration.producer.CustomerJsonProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerJsonProducer jsonProducer;

    public void send(final CustomerDTO customerDTO) {
        jsonProducer.send(customerDTO);
    }
}