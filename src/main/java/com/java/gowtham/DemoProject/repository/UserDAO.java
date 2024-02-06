package com.java.gowtham.DemoProject.repository;

import com.java.gowtham.DemoProject.models.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    User findByFirstName(String name);

}
