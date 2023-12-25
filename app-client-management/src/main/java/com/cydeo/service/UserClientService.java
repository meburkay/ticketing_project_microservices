package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//We create this service/project for the consuming operations. All the consuming operations will be done from one place which is this service
@FeignClient(value = "user-service")//We delte the url here because we register to the eureka server and afterwards it is not important for as the port/url. We give the user-service name to eureka server and it gives us a service.
public interface UserClientService {

    @GetMapping("/api/v1/user/{username}")
    UserResponseDTO getUserDTOByUserName(@PathVariable("username") String username);
}
