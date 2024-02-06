package com.java.gowtham.DemoProject.service.user;

import com.java.gowtham.DemoProject.models.user.CreateUserRequest;
import com.java.gowtham.DemoProject.models.user.UpdateUserRequest;
import com.java.gowtham.DemoProject.models.user.User;
import com.java.gowtham.DemoProject.repository.UserDAO;
import com.java.gowtham.DemoProject.repository.user.UserRepository;
import com.java.gowtham.DemoProject.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//THIS CLASS IS USED TO TRANSFER THE METHODS DATA TO THE REPOSITORY CLASS
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDAO userDAO;

    @Override
    public User createUser(CreateUserRequest createUserRequest) {
        User user = new User();
        user.setFirstName(createUserRequest.getFirstName());
        user.setLastName(createUserRequest.getLastName());
        user.setEmail(createUserRequest.getEmail());
        user.setAge(createUserRequest.getAge());
        user.setDob(createUserRequest.getDob());
        return userRepository.createUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);

    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteUserByid(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public User updateUser(Long id, UpdateUserRequest updateUserRequest) {
        User user = userRepository.getUserById(id);
        if (user == null) {
            throw new RuntimeException("User not found ");
        }
        if (updateUserRequest.getFirstName() != null) {
            user.setFirstName(updateUserRequest.getFirstName());
        }
        if (updateUserRequest.getLastName() != null) {
            user.setLastName(updateUserRequest.getLastName());
        }
        return userRepository.updateUser(user);
    }

    @Override
    public User getUserByFirstName(String name) {
        return userRepository.getUserByFirstName(name);
    }
}
