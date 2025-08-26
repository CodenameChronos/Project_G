package com.peraza.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.OffsetDateTime;

@Entity
@Table(name = "TBL_RENTAL_DATA")
public class RentalData implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_RENTAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int rentalId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TRANSACTION")
    private TransactionData transactionData;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "START_RENTAL")
    private TransactionData transactionDate;
    
    @Column(name = "FINISH_RENTAL")
    private OffsetDateTime finishRental;

    
    
    //@Transient
    //private int rentalTimeInDays = transactionDate - finishRental;
}
