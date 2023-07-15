package com.layeredarchitecture.demo.service.impl;

import com.layeredarchitecture.demo.dto.User;
import com.layeredarchitecture.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserService userService;

    @Override
    public User getUserById(Long userId){
        return userService.getUserById(userId);
    }
}
