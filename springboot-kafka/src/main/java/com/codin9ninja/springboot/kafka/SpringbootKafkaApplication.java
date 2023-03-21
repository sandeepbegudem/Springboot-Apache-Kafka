package com.codin9ninja.springboot.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class SpringbootKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootKafkaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate){
		return  args -> {kafkaTemplate.send("Codin9Ninja", "Hello 😃🥳");

			//for(int i=0; i < 100; i++){
				//kafkaTemplate.send("Codin9Ninja", "hello kafka: " + i);
			//}

		};
	}

}
