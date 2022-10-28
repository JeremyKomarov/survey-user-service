package com.userService.controller;
import com.userService.model.User;
import com.userService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/user/create")
    public void createCustomer(@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping(value = "/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PutMapping(value = "/user/{id}/update")
    public void updateUserById(@PathVariable Long id,
                               @RequestBody User user){
        userService.updateUserById(id, user);
    }

    @DeleteMapping(value = "/user/{id}/delete")
    public void deleteCustomerById(@PathVariable Long id){
        userService.deleteUserById(id);
    }
}

