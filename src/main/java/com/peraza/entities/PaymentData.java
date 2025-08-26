package com.peraza.entities;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "TBL_PAYMENT")

public class PaymentData implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "ID_PAYMENT", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int paymentId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TRANSACTION", nullable = false)
    private TransactionData transactionId;

    @ManyToOne
    @JoinColumn(name = "NAME" ,nullable = false)
    private CustomerData customerName;

    @Column(name = "PAYMENT_TYPE", nullable = false)
    private String paymentType;

    @Column(name = "AMOUNT" ,nullable = false)
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
