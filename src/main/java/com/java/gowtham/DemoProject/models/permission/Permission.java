package com.java.gowtham.DemoProject.models.permission;

import com.java.gowtham.DemoProject.models.customer.Customer;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.List;

@Entity
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 45)
    private String name;
    @Column(length = 250)
    private String description;
    @Column(length = 20)
    private String type;
    @ManyToMany(mappedBy = "permissions", fetch = FetchType.LAZY)
    private List<Customer> customers;

    public Permission() {
    }

    public Permission(Long id, String name, String description, String type, List<Customer> customers) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.customers = customers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}