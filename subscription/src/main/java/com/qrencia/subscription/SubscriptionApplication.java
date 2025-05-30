package com.qrencia.subscription;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SubscriptionApplication {
	private static final Logger logger = LoggerFactory.getLogger(SubscriptionApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SubscriptionApplication.class, args);
		logger.info("Application started");
	}

}
