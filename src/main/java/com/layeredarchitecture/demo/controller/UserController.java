package com.layeredarchitecture.demo.controller;

import com.layeredarchitecture.demo.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserController {

    //client'dan userId bilgisi alınacak.
    @GetMapping(path = "/users/{userId}")
    public User getUserById(@PathVariable("userId") Long userId) {
    return null;
    }

}
