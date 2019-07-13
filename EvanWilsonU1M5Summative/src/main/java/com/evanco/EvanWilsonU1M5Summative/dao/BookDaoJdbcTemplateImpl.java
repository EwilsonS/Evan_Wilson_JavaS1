package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Book;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BookDaoJdbcTemplateImpl implements BookDao {

    // Init jdbc
    private JdbcTemplate jdbcTemplate;

    // Prepared sql statements
    private static final String INSERT_BOOK_SQL =
            "insert into book (isbn, publish_date, author_id, title, publisher_id, price ) values(?,?,?,?,?,?)";

    private static final String SELECT_BOOK_SQL =
            "select * from book where book_id = ?";

    private static final String SELECT_ALL_BOOKS_SQL =
            "select * from book";

    private static final String UPDATE_BOOK_SQL =
            "update book set isbn=? , publish_date=?, author_id=?, title=?, publisher_id=?, price=? where book_id=?";

    private static final String DELETE_BOOK_SQL =
            "delete from book where book_id=?";

    private static final String SELECT_BOOKS_BY_AUTHOR_ID_SQL =
            "select * from book where author_id=?";


    // Constructor injection
    public BookDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // Interface implementations
    @Override
    public Book addBook(Book book) {
        jdbcTemplate.update(INSERT_BOOK_SQL, book.getIsbn(), book.getPublishDate(), book.getAuthorId(),
                book.getTitle(), book.getPublisherId(), book.getPrice());

        // get the last id inserted into the db and set it to this book instance
        book.setBookId(jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class));
        return book;
    }

    @Override
    public Book getBook(int bookId) {
        try{
            return jdbcTemplate.queryForObject(SELECT_BOOK_SQL, this::mapRowToBook, bookId);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public List<Book> getAllBooks() {
        try{
            List<Book> books = jdbcTemplate.query(SELECT_ALL_BOOKS_SQL, this::mapRowToBook);
            return books;
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public void updateBook(Book book) {
        jdbcTemplate.update(UPDATE_BOOK_SQL, book.getIsbn(), book.getPublishDate(), book.getAuthorId(),
                book.getTitle(), book.getPublisherId(), book.getPrice(), book.getBookId());
    }

    @Override
    public void deleteBook(int bookId) {
        jdbcTemplate.update(DELETE_BOOK_SQL, bookId);
    }

    @Override
    public List<Book> getBooksByAuthorId(int authorId) {
        if(jdbcTemplate.query(SELECT_BOOKS_BY_AUTHOR_ID_SQL, this::mapRowToBook, authorId).isEmpty()){
            return null;
        } else{
            return jdbcTemplate.query(SELECT_BOOKS_BY_AUTHOR_ID_SQL, this::mapRowToBook, authorId);
        }
    }

    // Helper to map to result set
    private Book mapRowToBook(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setBookId(rs.getInt("book_id"));
        book.setIsbn(rs.getString("isbn"));
        book.setPublishDate(rs.getDate("publish_date"));
        book.setAuthorId(rs.getInt("author_id"));
        book.setTitle(rs.getString("title"));
        book.setPublisherId(rs.getInt("publisher_id"));
        book.setPrice(rs.getFloat("price"));
        return book;
    }
}
