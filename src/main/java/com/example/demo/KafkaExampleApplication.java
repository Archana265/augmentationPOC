package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.consumer","com.example.demo" })
public class KafkaExampleApplication {

	  public static void main(String[] args) {
	    SpringApplication.run(KafkaExampleApplication.class, args);
	  }
}
