package com.java.gowtham.DemoProject.repository.customer;

import com.java.gowtham.DemoProject.models.customer.Customer;
import com.java.gowtham.DemoProject.models.customer.UpdateCustomerRequest;
import com.java.gowtham.DemoProject.models.user.CreateUserRequest;

import java.util.List;

public interface CustomerRepository {
    Customer createCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer getCustomerById(Long id);
    List<Customer> getAllCustomers();
}
