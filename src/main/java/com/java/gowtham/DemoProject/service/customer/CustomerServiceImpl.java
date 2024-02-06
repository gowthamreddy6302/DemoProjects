package com.java.gowtham.DemoProject.service.customer;

import com.java.gowtham.DemoProject.models.customer.CreateCustomerRequest;
import com.java.gowtham.DemoProject.models.customer.Customer;
import com.java.gowtham.DemoProject.models.customer.UpdateCustomerRequest;
import com.java.gowtham.DemoProject.models.permission.Permission;
import com.java.gowtham.DemoProject.repository.customer.CustomerRepository;
import com.java.gowtham.DemoProject.repository.user.UserRepository;
import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(CreateCustomerRequest createCustomerRequest) {
        Customer customer = new Customer();
        customer.setName(createCustomerRequest.getName());
        customer.setOrganisation(createCustomerRequest.getOrganisation());
        customer.setCountry(createCustomerRequest.getCountry());
        customer.setState(createCustomerRequest.getState());
        customer.setDescription(createCustomerRequest.getDescription());
        customer.setTradeMark(createCustomerRequest.getTradeMark());
        customer.setPermissions(createCustomerRequest.getPermissions());
        return customerRepository.createCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Long id, UpdateCustomerRequest updateCustomerRequest) {
        Customer customer = customerRepository.getCustomerById(id);
        customer.setOrganisation(updateCustomerRequest.getOrganisation());
        customer.setCountry(updateCustomerRequest.getCountry());
        customer.setState(updateCustomerRequest.getState());
        customer.setDescription(updateCustomerRequest.getDescription());
        customer.setTradeMark(updateCustomerRequest.getTradeMark());
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepository.deleteCustomer(id);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerRepository.getCustomerById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }
}
