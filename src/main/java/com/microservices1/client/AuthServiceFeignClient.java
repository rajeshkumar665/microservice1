package com.microservices1.client;

import com.microservices1.Dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;



@FeignClient(name = "AUTHSERVICE")
public interface AuthServiceFeignClient {

    @GetMapping("/api/v1/auth/get-user")
    User getUserByUsername(@RequestParam("username") String username, @RequestHeader("Authorization") String token);
}
