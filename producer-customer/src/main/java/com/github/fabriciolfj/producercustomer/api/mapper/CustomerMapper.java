package com.github.fabriciolfj.producercustomer.api.mapper;

import com.github.fabriciolfj.producercustomer.api.dto.CustomerDTO;
import com.github.fabriciolfj.schema.CustomerSchema;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
@DecoratedWith(CustomerMapperDecorator.class)
public interface CustomerMapper {

    CustomerSchema toDomain(final CustomerDTO dto);
}
