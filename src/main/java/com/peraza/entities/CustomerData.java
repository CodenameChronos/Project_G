package com.peraza.entities;

import jakarta.persistence.*;
import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "TBL_CUSTOMER_DATA")
public class CustomerData implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "Id_Customer", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idCustomer;

    @Column(name = "Customer_Name", nullable = false)
    private String customerName;
    
    @Column(name = "Active_Rentals")
    private int activeRentals;

    @OneToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL, mappedBy = "paymentId")
    private List<PaymentData> paymentDataList = new ArrayList<>();


    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getActiveRentals() {
        return activeRentals;
    }

    public void setActiveRentals(int activeRentals) {
        this.activeRentals = activeRentals;
    }
    
}
