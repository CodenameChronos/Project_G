package com.peraza.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.OffsetDateTime;
import java.util.List;

@Entity
@Table(name = "TBL_TRANSACTION")

public class TransactionData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_TRANSACTION", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int transactionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_BOOK", nullable = false)
    private BookData bookId;

    @Column(name = "TRANSACTION_TYPE", nullable = false)
    private String transactionType;

    @Column(name= "DATE", nullable = false)
    private OffsetDateTime transactionDate;

    @OneToMany(fetch = FetchType.LAZY)
    private List<TransactionData> transactions;

    public TransactionData() {
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getBookId() {
        return bookId.getBookId();
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
