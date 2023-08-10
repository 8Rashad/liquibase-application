package com.example.liquibaseapplication.service;

import com.example.liquibaseapplication.model.UserRequest;
import com.example.liquibaseapplication.model.UserResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class UserService {
    public UserResponse getUser(Long id){
        log.info("ActionLog.getUser.start id:{}", 23);
        var user = new UserResponse(id, "mock_user", 23);
        log.error("ActionLog.getUser.error user not found with id:{}", id);
        return user;
    }

    public List<UserResponse> getUsers(){
        return List.of(new UserResponse(1L, "mock_user", 23));
    }

    public void saveUser(UserRequest user){
        System.out.println("Assume we save user " + user);
    }

}
