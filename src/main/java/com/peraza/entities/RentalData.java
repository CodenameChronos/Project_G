package com.peraza.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "TBL_RENTAL_DATA")

public class RentalData implements Serializable {

    @Id
    @Column(name = "ID_RENTAL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int rentalId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TRANSACTION")
    private TransactionData transactionData;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "START_RENTAL_DATE")
    private TransactionData transactionDate;

}
