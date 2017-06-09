package jpa.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by E6430 on 06/06/17.
 */
@Entity
@Table(name = "book")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "author")
    private String author;
    @Column(name = "category")
    private String category;
    @Column(name = "isbn")
    private String isbn;
    @Column(name = "price")
    private double price;
    @Column(name = "numberPage")
    private int numberPage;
    @Column(name = "publishDate")
    @Temporal(TemporalType.DATE)
    private Date publishDate;

    public BookEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id="+id +
                ", name='"+name+'\''+
                ", authod='"+author+'\''+
                ", category='"+category+'\''+
                ", isbn='"+isbn+'\''+
                ", price='"+price+'\''+
                ", numberOfPage='"+numberPage+'\''+
                ", publishDate='"+publishDate+
                '}';


    }
}
