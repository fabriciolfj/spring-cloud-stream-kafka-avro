package com.github.fabriciolfj.producercustomer.api.mapper;

import com.github.fabriciolfj.producercustomer.api.dto.CustomerDTO;
import com.github.fabriciolfj.schema.CustomerSchema;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor
public abstract class CustomerMapperDecorator implements CustomerMapper {


    @Override
    public CustomerSchema toDomain(CustomerDTO dto) {
        var random = new Random();
        return CustomerSchema.newBuilder()
                .setFirstName(dto.getFirstName())
                .setLastName(dto.getLastName())
                .setId(random.nextLong())
                .build();
    }
}
