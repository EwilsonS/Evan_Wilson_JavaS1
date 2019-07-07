package com.evanco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This web service is a quote-of-the-day, word-of-the-day, and magic 8-ball service.
 * To use this app, run this file and open your browser(GET only)/ postman(POST and GET).
 * Endpoints: /quote , /word, /magic
 * See controller for more detail
 * version: 0.0.1
 * created by Evan Wilson
 */

@SpringBootApplication
public class QuoteWordMagicServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuoteWordMagicServiceApplication.class, args);
	}
}
