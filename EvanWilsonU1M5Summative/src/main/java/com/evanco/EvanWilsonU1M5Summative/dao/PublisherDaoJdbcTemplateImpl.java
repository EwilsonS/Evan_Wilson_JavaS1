package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Publisher;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class PublisherDaoJdbcTemplateImpl implements PublisherDao{

    // Init jdbc
    private JdbcTemplate jdbcTemplate;

    // prepared statements
    private static final String INSERT_PUBLISHER_SQL =
            "insert into publisher (name, street, city, state, postal_code, phone, email) " +
                    "values (?,?,?,?,?,?,?)";

    private static final String SELECT_PUBLISHER_SQL =
            "select * from publisher where publisher_id=?";

    private static final String SELECT_ALL_PUBLISHERS_SQL =
            "select * from publisher";

    private static final String UPDATE_PUBLISHER_SQL =
            "update publisher set name=?, street=?, city=?, state=?, postal_code=?, " +
                    "phone=?, email=? where publisher_id=?";

    private static final String DELETE_PUBLISHER_SQL =
            "delete from publisher where publisher_id=?";

    private  static  final String DELETE_BOOK_BY_PUBLISHER_ID_SQL =
            "delete from book where publisher_id=?";

    // Constructor injection
    public PublisherDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    // Interface implementation
    @Override
    public Publisher addPublisher(Publisher publisher) {
        jdbcTemplate.update(INSERT_PUBLISHER_SQL, publisher.getName(), publisher.getStreet(), publisher.getCity(),
                publisher.getState(), publisher.getPostalCode(), publisher.getPhone(), publisher.getEmail());

        publisher.setPublisherId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return publisher;
    }

    @Override
    public Publisher getPublisher(int publisherId) {
        try{
            return jdbcTemplate.queryForObject(SELECT_PUBLISHER_SQL, this::mapRowToPublisher, publisherId);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Publisher> getAllPublishers() {
        try{
            return jdbcTemplate.query(SELECT_ALL_PUBLISHERS_SQL, this::mapRowToPublisher);
        } catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public void updatePublisher(Publisher publisher) {
        jdbcTemplate.update(UPDATE_PUBLISHER_SQL, publisher.getName(), publisher.getStreet(), publisher.getCity(),
                publisher.getState(), publisher.getPostalCode(), publisher.getPhone(), publisher.getEmail(),
                publisher.getPublisherId());
    }

    @Override
    public void deletePublisher(int publisherId) {
        jdbcTemplate.update(DELETE_BOOK_BY_PUBLISHER_ID_SQL, publisherId);
        jdbcTemplate.update(DELETE_PUBLISHER_SQL, publisherId);
    }

    // Helper method to map result set
    private Publisher mapRowToPublisher(ResultSet rs, int rowNum) throws SQLException {
        Publisher publisher = new Publisher();
        publisher.setPublisherId(rs.getInt("publisher_id"));
        publisher.setName(rs.getString("name"));
        publisher.setStreet(rs.getString("street"));
        publisher.setCity(rs.getString("city"));
        publisher.setState(rs.getString("state"));
        publisher.setPostalCode(rs.getString("postal_code"));
        publisher.setPhone(rs.getString("phone"));
        publisher.setEmail(rs.getString("email"));
        return publisher;
    }
}
