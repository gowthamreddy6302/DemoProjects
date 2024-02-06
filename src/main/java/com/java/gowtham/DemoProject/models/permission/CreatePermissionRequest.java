package com.java.gowtham.DemoProject.models.permission;

import com.java.gowtham.DemoProject.models.customer.Customer;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class CreatePermissionRequest {
    @NotNull(message = "NAME SHOULD NOT BE NULL")
    @Size(max = 50, message = "Characters in name should not exceed 50 characters")
    private String name;

    @NotNull(message = "DESCRIPTION SHOULD NOT BE NULL")
    @Size(max = 50, message = "Characters in description should not exceed 50 characters")
    private String description;

    @NotNull(message = "TYPE SHOULD NOT BE NULL")
    @Size(max = 50, message = "Characters in type should not exceed 50 characters")
    private String type;

    private List<Customer> customers;

    public CreatePermissionRequest() {
    }

    public CreatePermissionRequest(String name, String description, String type, List<Customer> customers) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.customers = customers;
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
