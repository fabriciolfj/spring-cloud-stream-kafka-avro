package com.github.fabriciolfj.producercustomer;

import com.github.fabriciolfj.producercustomer.domain.integration.mensageria.ProducerJsonSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(ProducerJsonSink.class)
@SpringBootApplication
public class ProducerCustomerJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerCustomerJsonApplication.class, args);
	}

}
