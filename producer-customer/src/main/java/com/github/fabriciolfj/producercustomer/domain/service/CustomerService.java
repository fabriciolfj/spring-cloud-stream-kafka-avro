package com.github.fabriciolfj.producercustomer.domain.service;

import com.github.fabriciolfj.producercustomer.api.dto.CustomerDTO;
import com.github.fabriciolfj.producercustomer.api.mapper.CustomerMapper;
import com.github.fabriciolfj.producercustomer.domain.integration.producer.CustomerProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerProducer producer;
    private final CustomerMapper mapper;

    public void send(final CustomerDTO customerDTO) {
        var customer = mapper.toDomain(customerDTO);
        producer.send(customer);
    }
}