package jpa;

import jpa.config.SpringConfig;
import jpa.entity.BookEntity;
import jpa.repository.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Created by E6430 on 06/06/17.
 */
public class Main {
    static ApplicationContext context =
            new AnnotationConfigApplicationContext(SpringConfig.class);
    static BookRepository repository = context.getBean("bookRepository", BookRepository.class);

    public static void main(String[] args) {


    }

    //    JPA with CRUDRepository create book and read book
    public static void readBook() {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("Java A - Z");
        bookEntity.setAuthor("Roger");
        repository.save(bookEntity);
        System.out.println("Book" + bookEntity);

        repository.findOne(1);
        System.out.println("book is:" + bookEntity.toString());


//            findAll like select * from table

        List<BookEntity> listBook = (List<BookEntity>) repository.findAll();
        System.out.println("Found: " + listBook.size());
        System.out.println("there are:");
        for (BookEntity book : listBook) {
            System.out.println("book :" + book.toString());

            bookEntity = repository.findOne(1);
            bookEntity.setName("Putin");
            repository.save(bookEntity);

            repository.delete(4);
        }
    }

    //        JPA with Queries Method
    public static void findBook() {

        List<BookEntity> list = repository.findByAuthor("Roger");
        if (list.size() != 0) {
            System.out.println("Found:" + list.size() + " books is Roger");
            System.out.println("they are:");
            for (BookEntity book : list) {
                System.out.println(book.toString());
            }

        }
    }

//    JPA with Query using JPQL

}
