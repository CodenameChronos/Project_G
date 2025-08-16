package com.peraza.entities;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Entity
@Table(name = "TBL_BOOK_DATA")

public class BookData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_BookType", nullable = false)
    private int bookTypeID;

    @Column(name= "Title", nullable = false)
    private String title;

    @Column(name = "Genre")
    private String genre;

    @Column(name = "Author")
    private String author;

    @Column(name = "Publisher", nullable = false)
    private String publisher;

    @Column(name = "Stock")
    private boolean available;

    @Lob
    @Column(name = "Regular_Expression")
    private String regularExpression;

    public BookData() {
    }

    public int getBookTypeID() {
        return bookTypeID;
    }

    public void setBookTypeID(int bookTypeID) {
        this.bookTypeID = bookTypeID;
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
