package com.userService.controller;

import com.userService.poll.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PollController {

    @Autowired
    private PollService pollService;

    @DeleteMapping(value = "/vote/deleteVotesByUserId/{userId}")
    public void deleteVoteByUserId(@PathVariable Long userId){
        pollService.deleteAllVotesByUserId(userId);
    }
}
