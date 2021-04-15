package com.sharadmishra2710.user.service;

import com.sharadmishra2710.user.dto.Department;
import com.sharadmishra2710.user.dto.UserDetails;
import com.sharadmishra2710.user.entity.User;
import com.sharadmishra2710.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public User addUser(User user) {

        log.info("inside addUser of UserService");
        return userRepository.save(user);
    }

    public User getUserById(Long id) {

        log.info("inside getUserById of UserService");
        return userRepository.findById(id).get();
    }

    public List<User> getAllUsers() {

        log.info("inside getAllUsers of UserService");
        return userRepository.findAll();
    }

    public UserDetails getUserDetails(Long id) {

        log.info("inside getAllUsers of UserService");
        UserDetails ud=new UserDetails();
        User u= userRepository.findById(id).get();
        Department d=restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+
                u.getDeptId(), Department.class);
        ud.setUser(u);
        ud.setDepartment(d);
        return ud;
    }
}
