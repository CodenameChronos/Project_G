package com.peraza.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_STOCK_DATA")
public class StockData {
    
    @Id
    @JoinColumn(name = "Id_Book", nullable = false)
    private BookData BookId;
    
    @Column(name = "In_Stock", nullable = false)
    private boolean stillInStock;
    
    @Column(name = "Quantity")
    private int quantity;
}
