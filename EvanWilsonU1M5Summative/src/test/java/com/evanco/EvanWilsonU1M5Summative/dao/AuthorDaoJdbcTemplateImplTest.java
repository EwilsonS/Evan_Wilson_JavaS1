package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Author;
import com.evanco.EvanWilsonU1M5Summative.model.Book;
import com.evanco.EvanWilsonU1M5Summative.model.Publisher;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class AuthorDaoJdbcTemplateImplTest {

    // Dependency injection
    @Autowired
    AuthorDao authorDao;
    @Autowired
    BookDao bookDao;
    @Autowired
    PublisherDao publisherDao;

    @Before
    public void setUp() throws Exception{
        // Clear test db
        // Delete books first, then authors since books depend on authors
        List<Book> bookList = bookDao.getAllBooks();
        bookList.stream()
                .forEach(book -> bookDao.deleteBook(book.getBookId()));

        List<Author> authorList = authorDao.getAllAuthors();
        authorList.stream()
                .forEach(author -> authorDao.deleteAuthor(author.getAuthorId()));

        List<Publisher> publisherList = publisherDao.getAllPublishers();
        publisherList.stream()
                .forEach(publisher -> publisherDao.deletePublisher(publisher.getPublisherId()));
    }

    @Test
    public void addAuthorTest(){
        Author author = new Author();
        author.setFirstName("Evan");
        author.setLastName("Wilson");
        author.setStreet("3525 Main St.");
        author.setCity("Miami");
        author.setState("WY");
        author.setPostalCode("29996");
        author.setPhone("303-265-5555");
        author.setEmail("evanEvan@gmail.biz");
        author = authorDao.addAuthor(author);
        assertNotEquals(0, author.getAuthorId());
    }

    @Test
    public void getAuthorTest(){
        Author author = new Author();
        author.setFirstName("Evan");
        author.setLastName("Wilson");
        author.setStreet("3525 Main St.");
        author.setCity("Miami");
        author.setState("WY");
        author.setPostalCode("29996");
        author.setPhone("303-265-5555");
        author.setEmail("evanEvan@gmail.biz");
        author = authorDao.addAuthor(author);

        Author author2 = authorDao.getAuthor(author.getAuthorId());
        assertEquals(author, author2);
    }

    @Test
    public void getAllAuthorsTest(){
        List<Author> authorList = authorDao.getAllAuthors();
        authorList.stream()
                .forEach(author -> authorDao.deleteAuthor(author.getAuthorId()));

        Author author = new Author();
        author.setFirstName("Evan");
        author.setLastName("Wilson");
        author.setStreet("3525 Main St.");
        author.setCity("Miami");
        author.setState("WY");
        author.setPostalCode("29996");
        author.setPhone("303-265-5555");
        author.setEmail("evanEvan@gmail.biz");
        authorDao.addAuthor(author);

        author = new Author();
        author.setFirstName("Evan");
        author.setLastName("Wilson");
        author.setStreet("3525 Main St.");
        author.setCity("Miami");
        author.setState("WY");
        author.setPostalCode("29996");
        author.setPhone("303-265-5555");
        author.setEmail("evanEvan@gmail.biz");
        authorDao.addAuthor(author);

        assertEquals(2, authorDao.getAllAuthors().size());
    }

    @Test
    public void updateAuthorTest(){
        Author author = new Author();
        author.setFirstName("Evan");
        author.setLastName("Wilson");
        author.setStreet("3525 Main St.");
        author.setCity("Miami");
        author.setState("WY");
        author.setPostalCode("29996");
        author.setPhone("303-265-5555");
        author.setEmail("evanEvan@gmail.biz");
        authorDao.addAuthor(author);

        author.setFirstName("Update");
        author.setLastName("Update");
        author.setStreet("3525 Update St.");
        author.setCity("Update");
        author.setState("UD");
        author.setPostalCode("00000");
        author.setPhone("000-000-0000");
        author.setEmail("Update@gmail.biz");
        authorDao.updateAuthor(author);

        Author author2 = authorDao.getAuthor(author.getAuthorId());
        assertEquals(author, author2);
    }

    @Test
    public void deleteAuthorTest(){
        // add a book and all FKs to test proper deletion order
        Author author = new Author();
        author.setFirstName("Evan");
        author.setLastName("Wilson");
        author.setStreet("3525 Main St.");
        author.setCity("Miami");
        author.setState("WY");
        author.setPostalCode("29996");
        author.setPhone("303-265-5555");
        author.setEmail("evanEvan@gmail.biz");
        author = authorDao.addAuthor(author);

        Author author2 = new Author();
        author2.setFirstName("Evan 2");
        author2.setLastName("Wilson 2");
        author2.setStreet("3525 Main St.");
        author2.setCity("Miami");
        author2.setState("WY");
        author2.setPostalCode("29996");
        author2.setPhone("303-265-5555");
        author2.setEmail("evanEvan@gmail.biz");
        author2 = authorDao.addAuthor(author2);

        Publisher publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("144514845");
        book.setPublishDate(Date.valueOf("2001-01-01"));
        book.setAuthorId(author.getAuthorId());
        book.setTitle("This book should not be here");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(18.99f);
        book = bookDao.addBook(book);

        Book book2 = new Book();
        book2.setIsbn("144514845");
        book2.setPublishDate(Date.valueOf("2001-01-01"));
        book2.setAuthorId(author2.getAuthorId());
        book2.setTitle("last added book");
        book2.setPublisherId(publisher.getPublisherId());
        book2.setPrice(18.99f);
        book2 = bookDao.addBook(book2);

        authorDao.deleteAuthor(author.getAuthorId());
        List<Book> books = bookDao.getBooksByAuthorId(author.getAuthorId());
        assertNull(books);

    }
}

