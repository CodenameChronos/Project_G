package com.peraza.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.Date;

@Entity
@Table(name = "TBL_TRANSACTION")

public class TransactionData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "Id_Transaction", nullable = false)
    private int transactionId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Book", nullable = false)
    private BookData bookId;

    @Column(name = "Transaction_Type", nullable = false)
    private String transactionType;

    @Column(name= "Date", nullable = false)
    private OffsetDateTime transactionDate;

    public TransactionData() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getBookId() {
        return bookId.getBookTypeID();
    }

    public void setBookId(BookData bookId) {
        this.bookId = bookId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public OffsetDateTime getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(OffsetDateTime transactionDate) {
        this.transactionDate = transactionDate;
    }
}
