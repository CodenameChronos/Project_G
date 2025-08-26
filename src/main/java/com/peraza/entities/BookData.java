package com.peraza.entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
@Table(name = "TBL_BOOK_DATA")
public class BookData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_BOOK", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int bookId;

    @Column(name= "TITLE", nullable = false)
    private String title;

    @Column(name = "GENRE", nullable = false)
    private String genre;

    @Column(name = "AUTHOR", unique = false)
    private String author;

    @Column(name = "PUBLISHER", nullable = false, unique = false)
    private String publisher;

    @Column(name = "STOCK")
    private boolean available;
    
    @OneToOne
    @JoinColumn(name = "RENTAL_PRICE/DAY")
    private StockData rentalPricePerDay;
    
    @OneToOne
    @JoinColumn(name = "BUY_PRICE")
    private StockData buyPrice;

    @Lob
    @Column(name = "REGULAR_EXPRESSION")
    private String regularExpression;

    public BookData() {
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getRegularExpression() {
        return regularExpression;
    }

    public void setRegularExpression(String regularExpression) {
        this.regularExpression = regularExpression;
    }
}
