package com.trilogyed.stwitter;

import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.config.EnableHypermediaSupport;

/**
 * @author Evan Wilson
 * @version 0.0.1
 *
 * The purpose of this application is to demonstrate the use of queues, edge services,
 * feign, caching, config servers and Eureka Stwitter is a social media service that
 * allows users to create posts an comment on an existing post.
 *
 * User routes from localhost:8889
 * "/posts" ........................ POST new post, GET all posts
 * "/posts/{id}" ................... GET
 * "/posts/user/{poster_name}"
 * "/comments"
 * "/comments/{comment_id}"
 * "/comments/postid/{post_id}"
 *
 * CACHE
 * - get post
 * - create post
 *
 */
//@EnableHypermediaSupport(type = EnableHypermediaSupport.HypermediaType.HAL)
@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@EnableCaching
public class StwitterServiceApplication {

	@Bean
	public RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
		RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
		rabbitTemplate.setMessageConverter(jackson2JsonMessageConverter());
		return rabbitTemplate;
	}

	@Bean
	public Jackson2JsonMessageConverter jackson2JsonMessageConverter() {
		return new Jackson2JsonMessageConverter();
	}

	public static void main(String[] args) {
		SpringApplication.run(StwitterServiceApplication.class, args);
	}

}
