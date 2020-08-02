package com.github.fabriciolfj.consumercustomerjson;

import com.github.fabriciolfj.consumercustomerjson.domain.integracao.mensageria.ConsumerSink;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(ConsumerSink.class)
@SpringBootApplication
public class ConsumerCustomerJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerCustomerJsonApplication.class, args);
	}

}
