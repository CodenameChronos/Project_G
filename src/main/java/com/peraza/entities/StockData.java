package com.peraza.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_STOCK_DATA")
public class StockData {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idStock;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_BOOK", nullable = false)
    private BookData BookId;
    
    @Column(name = "IN_STOCK", nullable = false)
    private boolean stillInStock;
    
    @Column(name = "QUANTITY")
    private int quantity;

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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
