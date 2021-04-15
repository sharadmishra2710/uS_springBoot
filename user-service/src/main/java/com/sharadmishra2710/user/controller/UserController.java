package com.sharadmishra2710.user.controller;

import com.sharadmishra2710.user.dto.UserDetails;
import com.sharadmishra2710.user.entity.User;
import com.sharadmishra2710.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user){
        log.info("inside addUser of UserController");
        return userService.addUser(user);
    }

    @GetMapping("/{id}/details")
    public UserDetails getUserDetails(@PathVariable("id") Long id){
        log.info("inside getUserDetails of UserController");
        return userService.getUserDetails(id);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable("id") Long id){
        log.info("inside getUserById of UserController");
        return userService.getUserById(id);
    }

    @GetMapping
    public List<User> getAllUsers(){

        log.info("inside getAllUsers of UserController");
        return userService.getAllUsers();
    }
}
