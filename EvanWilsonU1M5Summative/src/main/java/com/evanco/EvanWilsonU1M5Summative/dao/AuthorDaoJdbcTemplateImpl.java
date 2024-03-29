package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Author;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AuthorDaoJdbcTemplateImpl implements AuthorDao {

    // Init jdbc
    private JdbcTemplate jdbcTemplate;

    // Prepared sql statements
    private static final String INSERT_AUTHOR_SQL =
            "insert into author (first_name, last_name, street, city, state, postal_code, phone, email) " +
                    "values (?,?,?,?,?,?,?,?)";

    private static final String SELECT_AUTHOR_SQL =
            "select * from author where author_id = ?";

    private static final String SELECT_ALL_AUTHORS_SQL =
            "select * from author";

    private static final String UPDATE_AUTHOR_SQL =
            "update author set first_name=?, last_name=?, street=?, city=?, state=?, postal_code=?," +
                    "phone=?, email=? where author_id=?";

    private static final String DELETE_AUTHOR_SQL =
            "delete from author where author_id=?";

    private static final String DELETE_BOOK_BY_AUTHOR =
            "delete from book where author_id=?";


    // Constructor injection
    public AuthorDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Interface implementation
    @Override
    public Author addAuthor(Author author) {
        jdbcTemplate.update(INSERT_AUTHOR_SQL, author.getFirstName(), author.getLastName(), author.getStreet(),
                author.getCity(), author.getState(), author.getPostalCode(), author.getPhone(), author.getEmail());

        author.setAuthorId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return author;
    }

    @Override
    public Author getAuthor(int authorId) {
        return jdbcTemplate.queryForObject(SELECT_AUTHOR_SQL, this::mapRowToAuthor, authorId);
    }

    @Override
    public List<Author> getAllAuthors() {
        try {
            List<Author> authorList = jdbcTemplate.query(SELECT_ALL_AUTHORS_SQL, this::mapRowToAuthor);
            return authorList;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public void updateAuthor(Author author) {
        jdbcTemplate.update(UPDATE_AUTHOR_SQL, author.getFirstName(), author.getLastName(), author.getStreet(),
                author.getCity(), author.getState(), author.getPostalCode(), author.getPhone(), author.getEmail(),
                author.getAuthorId());
    }

    @Override
    public void deleteAuthor(int authorId) {
        // delete all dependent table rows before deleting authors
        jdbcTemplate.update(DELETE_BOOK_BY_AUTHOR, authorId);
        jdbcTemplate.update(DELETE_AUTHOR_SQL, authorId);
    }

    // Helper method to map result set
    private Author mapRowToAuthor(ResultSet rs, int rowNum) throws SQLException {
        Author author = new Author();
        author.setAuthorId(rs.getInt("author_id"));
        author.setFirstName(rs.getString("first_name"));
        author.setLastName(rs.getString("last_name"));
        author.setStreet(rs.getString("street"));
        author.setCity(rs.getString("city"));
        author.setState(rs.getString("state"));
        author.setPostalCode(rs.getString("postal_code"));
        author.setPhone(rs.getString("phone"));
        author.setEmail(rs.getString("email"));
        return author;
    }
}
