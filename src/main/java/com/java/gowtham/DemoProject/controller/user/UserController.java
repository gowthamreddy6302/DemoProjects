package com.java.gowtham.DemoProject.controller.user;

import com.java.gowtham.DemoProject.models.user.CreateUserRequest;
import com.java.gowtham.DemoProject.models.user.UpdateUserRequest;
import com.java.gowtham.DemoProject.models.user.User;
import com.java.gowtham.DemoProject.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// THIS CLASS IS USED TO CREATE THE VALUES FOR THE DATA
// AND USED TO TRANSFER THE PROVIDED DATA TO THE SERVICE CLASS
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody CreateUserRequest createUserRequest) {
        User user = userService.createUser(createUserRequest);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(name = "id") Long userId) {
        User user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable Long id) {
         userService.deleteUserById(id);
         String str = "SUCCESSFULLY DELETED";
        return new ResponseEntity<>(str,HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> user = userService.getAllUsers();
        return new ResponseEntity<>(user,HttpStatus.OK);
    }

    @PutMapping("/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody UpdateUserRequest updateUserRequest) {
        User user = userService.updateUser(id,updateUserRequest);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/users/get/{name}")
    public ResponseEntity<User> getUserByFirstName(@PathVariable String name){
        User user = userService.getUserByFirstName(name);
        return new ResponseEntity<>(user,HttpStatus.OK);
    }
}
