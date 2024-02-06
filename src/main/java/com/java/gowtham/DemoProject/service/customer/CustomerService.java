package com.java.gowtham.DemoProject.service.customer;

import com.java.gowtham.DemoProject.models.customer.CreateCustomerRequest;
import com.java.gowtham.DemoProject.models.customer.Customer;
import com.java.gowtham.DemoProject.models.customer.UpdateCustomerRequest;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(CreateCustomerRequest createCustomerRequest);

    Customer updateCustomer(Long id, UpdateCustomerRequest updateCustomerRequest);

    void deleteCustomer(Long id);

    Customer getCustomerById(Long id);

    List<Customer> getAllCustomers();
}
