package com.java.gowtham.DemoProject.repository.user;

import com.java.gowtham.DemoProject.models.user.User;

import java.util.List;

public interface UserRepository {
    User createUser(User user);
    User getUserById(Long id);

    void deleteUserByid(Long id);

    List<User> getAllUsers();

    User updateUser(User user);

    User getUserByFirstName(String name);
}
