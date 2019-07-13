package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Publisher;

import java.util.List;

public interface PublisherDao {
    /**
     * Add a single publisher object to the database.
     * .update() takes a sql or prepared sql statement for the first arg
     * and each property for each additional arg (omitting the publisherId).
     * We then, set the publisherId by using query "select LAST_INSERT_ID()"
     * @param publisher type Publisher
     * @return new Publisher object
     */
    Publisher addPublisher(Publisher publisher);

    /**
     * Get one publisher by the publisherId.
     * Using method reference this::mapRowToPublisher as the second param in .queryForObject(), we are able
     * to connect our Publisher instance(s) properties to their corresponding columns in the database
     * to retrieve a single publisher object with a given publisherId.
     * @param publisherId type int
     * @return Publisher publisher
     */
    Publisher getPublisher(int publisherId);

    /**
     * Get all publishers from the publisher table in database.
     * Using method reference this::mapRowToPublisher as the second param in .query(), we are able
     * to connect our Publisher instance(s) properties to their corresponding columns in the database.
     * @return List<Publisher> publishers
     */
    List<Publisher> getAllPublishers();

    /**
     * Update an existing publisher
     * .update() takes an sql or prepared sql statement for the first arg and each property
     * omitting the publisherId for each additional arg. Only use the publisher id as the final param
     * to correspond to the where clause in the prepared statement
     * We then, set the publisherId by using query "select LAST_INSERT_ID()"
     * @param publisher type Publisher
     */
    void updatePublisher(Publisher publisher);

    /**
     * Delete one publisher by a given publisherId. use . update() to pass prepared statement
     * and publisherId to sql for publisher deletion.
     * @param publisherId type int
     */
    void deletePublisher(int publisherId);
}
