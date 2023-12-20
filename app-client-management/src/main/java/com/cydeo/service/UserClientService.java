package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//We create this service/project for the consuming operations. All the consuming operations will be done from one place which is this service
@FeignClient(value = "user-service",url = "http://localhost:9090")
public interface UserClientService {

    @GetMapping("/api/v1/user/{username}")
    UserResponseDTO getUserDTOByUserName(@PathVariable("username") String username);
}
