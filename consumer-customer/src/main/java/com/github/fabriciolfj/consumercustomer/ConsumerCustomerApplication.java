package com.github.fabriciolfj.consumercustomer;

import com.github.fabriciolfj.consumercustomer.domain.integration.mensageria.CustomerSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(CustomerSink.class)
public class ConsumerCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerCustomerApplication.class, args);
	}

}
