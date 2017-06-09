package jpa.repository;

import jpa.entity.BookEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;


/**
 * Created by E6430 on 06/06/17.
 */
public interface BookRepository extends CrudRepository<BookEntity, Integer>{

//  Get all book where author = Roger
    List<BookEntity> findByAuthor(String author);
//    Get all book where Author = Roger and prive = 100
    List<BookEntity> findByAuthorAndPrice(String author, double price);
//    Get all book where price = 100 and number of page = 150
    List<BookEntity> findByPriceAndNumberPage(double price, int numberPage);
//    Get all book where price < 100
    List<BookEntity> findByPriceLessThan(double price);
//    Get all book where price >= 120
    List<BookEntity> findByPriceGreaterThanEqual(double price);
//    Get all book where book name containing "ja"
    List<BookEntity> findByNameContaining(String searchWords);
//    Get book where isbn = 123123123
    BookEntity findByIsbn(String isbn);
//    Get all book where publish Date is after 2015-12-12
    List<BookEntity> findByPublishDateAfter(Date date);

    @Query("select b from BookEntity b where b.name ?1")// ?1: param 1, ?2: param 2
    List<BookEntity> getBookNameStartWith(String name);

    @Query(value = "select * from BookEntity b where b.price <?1 and b.numberPage >= ?2")
    List<BookEntity> getBookWherePriceLessThanAndNumberPageGreaterThanEqual(double price, int numberPage);
}
