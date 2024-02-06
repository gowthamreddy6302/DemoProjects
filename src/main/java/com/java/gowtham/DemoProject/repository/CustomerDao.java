package com.java.gowtham.DemoProject.repository;

import com.java.gowtham.DemoProject.models.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDao extends JpaRepository<Customer, Long> {
}
