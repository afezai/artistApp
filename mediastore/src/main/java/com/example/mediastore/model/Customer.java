package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Customer {

    @Id
    private Integer customer_id;

    public Integer getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Integer customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Employee getSupport_rep_id() {
        return support_rep_id;
    }

    public void setSupport_rep_id(Employee support_rep_id) {
        this.support_rep_id = support_rep_id;
    }

    private String firstName;
    private String lastName;

    // Other fields...

    @ManyToOne
    @JoinColumn(name = "support_rep_id")
    private Employee support_rep_id;

    // Constructors, getters, setters...
}
