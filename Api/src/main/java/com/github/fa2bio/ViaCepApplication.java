package com.github.fa2bio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ViaCepApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViaCepApplication.class, args);
	}

}
