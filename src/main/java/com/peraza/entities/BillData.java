package com.peraza.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_BILL_DATA")
public class BillData implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id()
    @Column(name = "ID_BILL")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idBill;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TRANSACTION" ,nullable = false, unique = false)
    private TransactionData transactionId;
    
    @ManyToOne
    @JoinColumn(name = "ID_BOOK", nullable = false, unique = false)
    private BookData bookId;
    
    @Column(name = "QUANTITY")
    private int quantity;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRICE", nullable = false, unique = false)
    private StockData price;
    
       
}
