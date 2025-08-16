package com.peraza.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PAYMENT")

public class PaymentData {

    @Id
    @Column(name = "Id_Payment", nullable = false)
    private int paymentId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Id_Transaction", nullable = false)
    private TransactionData transactionId;

    @Column(name = "Name" ,nullable = false)
    private String customerName;

    @Column(name = "Last_Name")
    private String customerLastName;

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
