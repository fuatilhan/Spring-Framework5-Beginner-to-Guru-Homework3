package com.fuatilhan.Spring5WebApplication.bootstrap;

import com.fuatilhan.Spring5WebApplication.domain.Author;
import com.fuatilhan.Spring5WebApplication.domain.Book;
import com.fuatilhan.Spring5WebApplication.domain.Publisher;
import com.fuatilhan.Spring5WebApplication.repositories.AuthorRepository;
import com.fuatilhan.Spring5WebApplication.repositories.BookRepository;
import com.fuatilhan.Spring5WebApplication.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Publisher publisher = new Publisher();
        publisher.setName("Ithaki Yayinlari");
        publisher.setCity("Istanbul");
        publisher.setState("TR");

        publisherRepository.save(publisher);
        System.out.println("Number of Publisher: " + publisherRepository.count());



        Author eric=new Author("Eric","Evans");
        Book ddd=new Book("Domain Driven Design","1234532");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);




        Author rod=new Author("Rod","Johnson");
        Book noEJB=new Book("J2EE Development without EJB","12312315556");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Started in BootStrap");
        System.out.println("Number of books: "+bookRepository.count());
        System.out.println("Publisher Number of books: "+publisher.getBooks().size());





    }
}
