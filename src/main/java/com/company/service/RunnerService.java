package com.company.service;

import com.company.model.User;
import com.company.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RunnerService {

    @Autowired
    private UserRepository userRepository;


    @Transactional
    public void run() {
        User user = new User();
        user.setUsername("first_user");

        userRepository.save(user);

        user.setUsername("first user");
        userRepository.update(user);

        System.out.println("User:" + user.getUsername());
    }
}
