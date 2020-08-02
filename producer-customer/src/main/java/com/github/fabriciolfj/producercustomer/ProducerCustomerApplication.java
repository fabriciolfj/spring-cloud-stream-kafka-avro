package com.github.fabriciolfj.producercustomer;

import com.github.fabriciolfj.producercustomer.domain.integration.mensageria.ProducerSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(ProducerSink.class)
@SpringBootApplication
public class ProducerCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerCustomerApplication.class, args);
	}

}
