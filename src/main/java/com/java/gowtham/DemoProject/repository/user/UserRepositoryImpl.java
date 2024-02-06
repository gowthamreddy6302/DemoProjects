package com.java.gowtham.DemoProject.repository.user;

import com.java.gowtham.DemoProject.models.user.User;
import com.java.gowtham.DemoProject.repository.UserDAO;
import com.java.gowtham.DemoProject.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired
    private UserDAO userDAO;
    @Override
    public User createUser(User user) {
        return userDAO.save(user);
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> user = userDAO.findById(id);
        return user.orElse(null);
    }

    @Override
    public void deleteUserByid(Long id) {
        userDAO.deleteById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.findAll();
    }

    @Override
    public User updateUser(User user) {
        return userDAO.save(user);
    }

    @Override
    public User getUserByFirstName(String name) {
        return userDAO.findByFirstName(name);
    }
}
