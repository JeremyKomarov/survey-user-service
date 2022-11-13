package com.userService.service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.userService.model.User;
import com.userService.poll.PollService;
import com.userService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PollService pollService;

    @Autowired
    ObjectMapper objectMapper;

    @Override
    public void createUser(User user) {
        userRepository.createUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getUserById(id);
    }

    @Override
    public void updateUserById(Long id, User user) {
        userRepository.updateUserById(id, user);
    }

    @Override
    public void deleteUserById(Long id) {
        userRepository.deleteUserById(id);
        pollService.deleteAllVotesByUserId(id);
    }
}
