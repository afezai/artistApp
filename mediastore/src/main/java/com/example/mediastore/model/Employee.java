package com.example.mediastore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {

    public Integer getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Integer employee_id) {
        this.employee_id = employee_id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Employee getReports_to() {
        return reports_to;
    }

    public void setReports_to(Employee reports_to) {
        this.reports_to = reports_to;
    }

    @Id
    private Integer employee_id;

    private String lastName;
    private String firstName;

    // Other fields...

    @ManyToOne
    @JoinColumn(name = "reports_to")
    private Employee reports_to;

    // Constructors, getters, setters...
}
