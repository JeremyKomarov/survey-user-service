package com.userService.poll;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "PollService",
        url = "${internalAPI.pollAPI.url}"
)
public interface PollService {

    @DeleteMapping(value = "/vote/deleteVotesByUserId/{userId}")
    void  deleteAllVotesByUserId(@PathVariable Long userId);


}
