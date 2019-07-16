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
public class PublisherDaoJdbcTemplateImplTest {
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
        // Delete books first, then publishers since books depend on publishers
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
    public void addPublisherTest(){
        Publisher publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);
        assertNotEquals(0,publisher.getPublisherId());
    }

    @Test
    public void getPublisherTest(){
        Publisher publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Test2@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);

        Publisher publisher2 = publisherDao.getPublisher(publisher.getPublisherId());
        assertEquals(publisher,publisher2);
    }

    @Test
    public void getAllPublishersTest(){
        Publisher publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);

        publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);

        publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);

        assertEquals(3,publisherDao.getAllPublishers().size());
    }

    @Test
    public void updatePublisherTest(){
        Publisher publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);

//        publisher.setPublisherId(publisher.getPublisherId());
        publisher.setName("updated");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisherDao.updatePublisher(publisher);

        Publisher publisher2 = publisherDao.getPublisher(publisher.getPublisherId());
        assertEquals(publisher, publisher2);
    }

    @Test
    public void deletePublisherTest(){
        // create author to complete book object
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

        // git 2 publishers different names so books can differ for testing
        Publisher publisher = new Publisher();
        publisher.setName("Ferret Pub Co.");
        publisher.setStreet("123 Wrong Way Lane");
        publisher.setCity("Old York");
        publisher.setState("KY");
        publisher.setPostalCode("23231");
        publisher.setPhone("911-911-9111");
        publisher.setEmail("Ferretpubco@gmail.xom");
        publisher = publisherDao.addPublisher(publisher);

        Publisher publisher2 = new Publisher();
        publisher2.setName("Ferret Pub Co.");
        publisher2.setStreet("123 Wrong Way Lane");
        publisher2.setCity("Old York");
        publisher2.setState("KY");
        publisher2.setPostalCode("23231");
        publisher2.setPhone("911-911-9111");
        publisher2.setEmail("Ferretpubco@gmail.xom");
        publisher2 = publisherDao.addPublisher(publisher2);

        // add 2 book so they have different publishers
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
        book2.setAuthorId(author.getAuthorId());
        book2.setTitle("last added book");
        book2.setPublisherId(publisher2.getPublisherId());
        book2.setPrice(18.99f);
        book2 = bookDao.addBook(book2);

        assertEquals(2, publisherDao.getAllPublishers().size());

        // delete handled here
        publisherDao.deletePublisher(publisher.getPublisherId());
        assertEquals(1, publisherDao.getAllPublishers().size());
    }
}
