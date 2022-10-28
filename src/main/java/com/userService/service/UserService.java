package com.userService.service;

import com.userService.model.User;

public interface UserService {
    void createUser(User user);
    User getUserById(Long id);
    void updateUserById(Long id, User user);
    void deleteUserById(Long id);
}
