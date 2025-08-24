package com.peraza.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_PAYMENT")

public class PaymentData implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "Id_Payment", nullable = false)
    private int paymentId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Transaction", nullable = false)
    private TransactionData transactionId;

    @ManyToOne
    @JoinColumn(name = "Name" ,nullable = false)
    private CustomerData customerName;

    @ManyToOne
    @JoinColumn(name = "Last_Name")
    private CustomerData customerLastName;

    @Column(name = "Payment_Type", nullable = false)
    private String paymentType;

    @Column(name = "Ammount" ,nullable = false)
    private Double amount;

    public PaymentData() {
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getCustomerName() {
        return customerName.getCustomerName();
    }

    public void setCustomerName(CustomerData customerName) {
        this.customerName = customerName;
    }

    public String getCustomerLastName() {
        return customerLastName.getCustomerLastName();
    }

    public void setCustomerLastName(CustomerData customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
