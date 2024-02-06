package com.java.gowtham.DemoProject.repository.customer;

import com.java.gowtham.DemoProject.models.customer.Customer;
import com.java.gowtham.DemoProject.models.customer.UpdateCustomerRequest;
import com.java.gowtham.DemoProject.models.user.CreateUserRequest;
import com.java.gowtham.DemoProject.repository.CustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    @Autowired
    private CustomerDao customerDao;
    @Override
    public Customer createCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerDao.save(customer);
    }

    @Override
    public void deleteCustomer(Long id) {
        customerDao.deleteById(id);
    }

    @Override
    public Customer getCustomerById(Long id) {
        return customerDao.findById(id).get();
    }
    @Override
    public List<Customer> getAllCustomers() {
        return customerDao.findAll();
    }
}
