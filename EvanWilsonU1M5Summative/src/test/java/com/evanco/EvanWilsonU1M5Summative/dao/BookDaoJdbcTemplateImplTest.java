package com.evanco.EvanWilsonU1M5Summative.dao;

import com.evanco.EvanWilsonU1M5Summative.model.Author;
import com.evanco.EvanWilsonU1M5Summative.model.Book;
import com.evanco.EvanWilsonU1M5Summative.model.Publisher;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class BookDaoJdbcTemplateImplTest {

    // Dependency injection
    @Autowired
    AuthorDao authorDao;
    @Autowired
    BookDao bookDao;
    @Autowired
    PublisherDao publisherDao;

    @Before
    public void setUp() throws Exception{
        // Clear test db before running tests
        List<Book> bookList = bookDao.getAllBooks();
        bookList.stream()
                .forEach(book -> bookDao.deleteBook(book.getBookId()));
    }

    @Test
    public void addBookTest(){
        // add author and publisher before adding book
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
        book.setTitle("How not to get a job");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(18.99f);
        book = bookDao.addBook(book);

        assertEquals(book, bookDao.getBook(book.getBookId()));
    }

    @Test
    public void getBookTest(){
        // add author and publisher before adding book
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
        book.setTitle("How not to get a job");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(18.99f);
        book = bookDao.addBook(book);

        // test getBook
        Book book2 = bookDao.getBook(book.getBookId());
        assertEquals(book, book2);

        // negative test
        Book book3 = new Book();
        book3.setIsbn("9999");
        book3.setPublishDate(Date.valueOf("2001-01-01"));
        book3.setAuthorId(author.getAuthorId());
        book3.setTitle("How win all the time");
        book3.setPublisherId(publisher.getPublisherId());
        book3.setPrice(30.49f);
        book3 = bookDao.addBook(book3);
        assertNotEquals(book, book3);
    }

    @Test
    public void getAllBooksTest(){
        // add author and publisher before adding book
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
        book.setTitle("How not to get a job");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(18.99f);
        book = bookDao.addBook(book);

        Book book2 = bookDao.getBook(book.getBookId());
        assertEquals(book, book2);

        Book book3 = new Book();
        book3.setIsbn("9999");
        book3.setPublishDate(Date.valueOf("2001-01-01"));
        book3.setAuthorId(author.getAuthorId());
        book3.setTitle("How win all the time");
        book3.setPublisherId(publisher.getPublisherId());
        book3.setPrice(30.49f);
        book3 = bookDao.addBook(book3);

        assertEquals(2, bookDao.getAllBooks().size());
    }

    @Test
    public void updateBookTest(){
        // add author and publisher before adding book
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
        book.setTitle("Before update");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(18.99f);
        book = bookDao.addBook(book);

        book.setIsbn("Update 99");
        book.setPublishDate(Date.valueOf("2001-01-01"));
        book.setAuthorId(author.getAuthorId());
        book.setTitle("after UPDATE");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(30.49f);
        bookDao.updateBook(book);

        Book book2 = bookDao.getBook(book.getBookId());
        assertEquals(book, book2);
    }

    @Test
    public void deleteBookTest(){
        // add author and publisher before adding book
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
        book.setTitle("How not to get a job");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(18.99f);
        book = bookDao.addBook(book);

        Book book2 = bookDao.getBook(book.getBookId());
        assertEquals(book, book2);

        Book book3 = new Book();
        book3.setIsbn("9999");
        book3.setPublishDate(Date.valueOf("2001-01-01"));
        book3.setAuthorId(author.getAuthorId());
        book3.setTitle("How win all the time");
        book3.setPublisherId(publisher.getPublisherId());
        book3.setPrice(30.49f);
        book3 = bookDao.addBook(book3);

        bookDao.deleteBook(book.getBookId());

        assertEquals(1, bookDao.getAllBooks().size());
    }

    @Test
    public void getBooksByAuthorIdTest(){
        // add author and publisher before adding book
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
        author2.setFirstName("Scott");
        author2.setLastName("Wilson");
        author2.setStreet("777 2nd author rd");
        author2.setCity("Miami");
        author2.setState("tx");
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
        book.setTitle("How not to get a job");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(18.99f);
        book = bookDao.addBook(book);

        Book book2 = bookDao.getBook(book.getBookId());
        assertEquals(book, book2);

        Book book3 = new Book();
        book3.setIsbn("9999");
        book3.setPublishDate(Date.valueOf("2001-01-01"));
        book3.setAuthorId(author.getAuthorId());
        book3.setTitle("How win all the time");
        book3.setPublisherId(publisher.getPublisherId());
        book3.setPrice(30.49f);
        book3 = bookDao.addBook(book3);

        Book book4 = new Book();
        book4.setIsbn("9999");
        book4.setPublishDate(Date.valueOf("2001-01-01"));
        book4.setAuthorId(author2.getAuthorId());
        book4.setTitle("How win all the time");
        book4.setPublisherId(publisher.getPublisherId());
        book4.setPrice(30.49f);
        book4 = bookDao.addBook(book4);

        assertEquals(2, bookDao.getBooksByAuthorId(author.getAuthorId()).size());
        assertEquals(1, bookDao.getBooksByAuthorId(author2.getAuthorId()).size());
    }
}
