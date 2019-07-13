package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Author;

import java.util.List;

public interface AuthorDao {

    /**
     * Add a single author object to the database
     * .update() takes an sql or prepared sql statement for the first arg
     * and each property omitting the author_id for each additional arg.
     * We then, set the author_id by using query "select LAST_INSERT_ID()"
     * @param author type Author
     * @return new Author object
     */
    Author addAuthor(Author author);

    /**
     * Get one author by the authorId
     * Using method reference this::mapRowToAuthor as the second param in .queryForObject(), we are able
     * to connect our Author instance(s) properties to their corresponding columns in the database.
     * to retrieve a single author object with a given authorId
     * @param authorId type int
     * @return Author author
     */
    Author getAuthor(int authorId);

    /**
     * Get all authors from the author table in database.
     * Using method reference this::mapRowToAuthor as the second param in .query(), we are able
     * to connect our Author instance(s) properties to their corresponding columns in the database.
     * @return List<Author> authors
     */
    List<Author> getAllAuthors();

    /**
     * Update an existing author
     * .update() takes an sql or prepared sql statement for the first arg and each property
     * omitting the authorId for each additional arg. Only use the author id as the final param
     * to correspond to the where clause in the prepared statement
     * We then, set the authorId by using query "select LAST_INSERT_ID()"
     * @param author type Author
     */
    void updateAuthor(Author author);

    /**
     * Delete one author by a given authorId. use . update() to pass prepared statement
     * and authorId to sql for author deletion.
     * @param authorId type int
     */
    void deleteAuthor(int authorId);
}
