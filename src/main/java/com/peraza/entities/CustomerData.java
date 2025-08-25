package com.peraza.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "TBL_CUSTOMER_DATA")
public class CustomerData {
    
    @Id
    @Column(name = "Id_Customer", nullable = false)
    private int idCustomer;
    
    @OneToMany
    @Column(name = "Customer_Name", nullable = false)
    private String customerName;
    
    @OneToMany
    @Column(name = "Customer_Last_Name")
    private String customerLastName;
    
    @Column(name = "Active_Rentals")
    private int activeRentals;

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

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public int getActiveRentals() {
        return activeRentals;
    }

    public void setActiveRentals(int activeRentals) {
        this.activeRentals = activeRentals;
    }
    
}
