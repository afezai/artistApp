package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.sql.Timestamp;

@Entity
public class Invoice {

    public Integer getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Integer invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Customer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Customer customer_id) {
        this.customer_id = customer_id;
    }

    public Timestamp getInvoiceDate() {
        return invoice_date;
    }

    public void setInvoiceDate(Timestamp invoiceDate) {
        this.invoice_date = invoiceDate;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Id
    private Integer invoice_id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer_id;

    private Timestamp invoice_date;

    // Other fields...

    private BigDecimal total;

    // Constructors, getters, setters...
}

