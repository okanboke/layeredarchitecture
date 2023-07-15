package com.layeredarchitecture.demo.service;

import com.layeredarchitecture.demo.dto.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User getUserById(Long userId);
}
