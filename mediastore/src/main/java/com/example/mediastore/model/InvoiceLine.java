package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;

@Entity
public class InvoiceLine {

    public Integer getInvoiceLine_id() {
        return invoiceLine_id;
    }

    public void setInvoiceLine_id(Integer invoiceLine_id) {
        this.invoiceLine_id = invoiceLine_id;
    }

    public Invoice getInvoice_id() {
        return invoice_id;
    }

    public void setInvoice_id(Invoice invoice_id) {
        this.invoice_id = invoice_id;
    }

    public Track getTrack_id() {
        return track_id;
    }

    public void setTrack_id(Track track_id) {
        this.track_id = track_id;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Id
    private Integer invoiceLine_id;

    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice_id;

    @ManyToOne
    @JoinColumn(name = "track_id")
    private Track track_id;

    private BigDecimal unitPrice;
    private Integer quantity;

    // Constructors, getters, setters...
}
