package com.peraza.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_STOCK_DATA")
public class StockData implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idStock;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_BOOK", nullable = false)
    private BookData BookId;
    
    @OneToOne
    @Column(name = "RENTAL_PRICE/DAY")
    private double rentalPricePerDay;
    
    @OneToOne
    @Column(name = "BUY_PRICE")
    private double buyPrice;
    
    @Column(name = "IN_STOCK", nullable = false)
    private boolean stillInStock;
    
    @Column(name = "STOCK")
    private int stock;

    public StockData() {
    }

    public int getIdStock() {
        return idStock;
    }

    public void setIdStock(int idStock) {
        this.idStock = idStock;
    }

    public BookData getBookId() {
        return BookId;
    }

    public void setBookId(BookData bookId) {
        BookId = bookId;
    }

    public boolean isStillInStock() {
        return stillInStock;
    }

    public void setStillInStock(boolean stillInStock) {
        this.stillInStock = stillInStock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
