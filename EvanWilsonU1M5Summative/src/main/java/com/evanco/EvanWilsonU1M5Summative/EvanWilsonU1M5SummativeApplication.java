package com.evanco.EvanWilsonU1M5Summative;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This project involves the creation of a Java DAO for an existing database structure.
 * This project is a DAO and relational database that keeps track of books in a bookstore.
 *
 * DAO API allows callers to create, read, read all, update, and delete Books, Authors, and Publishers
 * in the system. The system also allows callers to find Books by Author.
 * This project uses JDBC templates, prepared statements and contains integration tests for each dao method
 *
 * Run this app from the tests created.
 *
 * @author Evan Wilson
 */
@SpringBootApplication
public class EvanWilsonU1M5SummativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EvanWilsonU1M5SummativeApplication.class, args);
	}

}
