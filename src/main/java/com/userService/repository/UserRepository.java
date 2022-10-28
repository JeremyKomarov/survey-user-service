package com.userService.repository;

import com.userService.model.User;

public interface UserRepository {
    void createUser(User user);
    User getUserById(Long id);
    void updateUserById(Long id, User user);
    void deleteUserById(Long id);

}
