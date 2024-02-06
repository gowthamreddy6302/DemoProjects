package com.java.gowtham.DemoProject.controller.customer;

import com.java.gowtham.DemoProject.models.customer.CreateCustomerRequest;
import com.java.gowtham.DemoProject.models.customer.Customer;
import com.java.gowtham.DemoProject.models.customer.UpdateCustomerRequest;
import com.java.gowtham.DemoProject.service.customer.CustomerService;
import com.java.gowtham.DemoProject.service.permission.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("")
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private PermissionService permissionService;

    @PostMapping("/customers")
    public Customer createCustomer(@RequestBody CreateCustomerRequest createCustomerRequest) {
        return customerService.createCustomer(createCustomerRequest);
    }

    @PutMapping("/customers/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody UpdateCustomerRequest updateCustomerRequest) {
        return customerService.updateCustomer(id, updateCustomerRequest);
    }

    @DeleteMapping("/customers/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        customerService.deleteCustomer(id);
        return "SUCCESSFULLY DELETED THE CUSTOMER";
    }

    @GetMapping("/customers/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

}
