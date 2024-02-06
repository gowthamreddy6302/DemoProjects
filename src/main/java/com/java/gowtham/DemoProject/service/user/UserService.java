package com.java.gowtham.DemoProject.service.user;

import com.java.gowtham.DemoProject.models.user.CreateUserRequest;
import com.java.gowtham.DemoProject.models.user.UpdateUserRequest;
import com.java.gowtham.DemoProject.models.user.User;

import java.util.List;

// THIS CLASS IS USED TO SET THE CURD OPERATIONS METHODS....!
public interface UserService {
    User createUser(CreateUserRequest createUserRequest);
    User getUserById(Long id);

    void deleteUserById(Long id);

    List<User> getAllUsers();

    User updateUser(Long id,UpdateUserRequest updateUserRequest);

    User getUserByFirstName(String name);
}
