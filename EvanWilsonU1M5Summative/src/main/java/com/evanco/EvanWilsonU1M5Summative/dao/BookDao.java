package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Book;

import java.util.List;

public interface BookDao {

    /**
     * Add a single book object to the database
     * .update() takes an sql or prepared sql statement for the first arg
     * and each property omitting the bookId for each additional arg.
     * We then, set the bookId by using query "select LAST_INSERT_ID()"
     * @param book type Book
     * @return new Book object
     */
    Book addBook(Book book);

    /**
     * Get one book by the bookId
     * Using method reference this::mapRowToBook as the second param in .queryForObject(), we are able
     * to connect our Book instance(s) properties to their corresponding columns in the database.
     * to retrieve a single book object with a given bookId
     * @param bookId type int
     * @return Book book
     */
    Book getBook(int bookId);

    /**
     * Get all books from the book table in database.
     * Using method reference this::mapRowToBook as the second param in .query(), we are able
     * to connect our Book instance(s) properties to their corresponding columns in the database.
     * @return List<Book> books
     */
    List<Book> getAllBooks();

    /**
     * Update an existing book
     * .update() takes an sql or prepared sql statement for the first arg and each property
     * omitting the bookId for each additional arg. Only use the book id as the final param
     * to correspond to the where clause in the prepared statement
     * We then, set the bookId by using query "select LAST_INSERT_ID()"
     * @param book type Book
     */
    void updateBook(Book book);

    /**
     * Delete one book by a given bookId. use . update() to pass prepared statement
     * and bookId to sql for book deletion.
     * @param bookId type int
     */
    void deleteBook(int bookId);

    /**
     * Find all books with a given author id by passing in authorid as a param.
     * Using method reference this::mapRowToBook as the second param in .query(), we are able
     * to connect our authorid to any corresponding rows in the book table.
     * Use a try/catch here to prevent empty returned lists from corrupting integration tests.
     * @param authorId type int
     * @return List<Book> books
     */
    List<Book> getBooksByAuthorId(int authorId);

}
