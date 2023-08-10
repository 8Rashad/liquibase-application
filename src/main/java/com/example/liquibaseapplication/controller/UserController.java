package com.example.liquibaseapplication.controller;

import com.example.liquibaseapplication.model.UserRequest;
import com.example.liquibaseapplication.model.UserResponse;
import com.example.liquibaseapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/users")
public class UserController {

    private final UserService userService;

    @GetMapping("/{id}")
    public UserResponse getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @GetMapping
    public List<UserResponse> getUsers(){
        return userService.getUsers();
    }


    @PostMapping
    @ResponseStatus(CREATED)
    public void saveUser(@RequestBody UserRequest user){
        userService.saveUser(user);
    }
}
