package com.vismijatech.main.service;

import com.vismijatech.main.entity.User;
import com.vismijatech.main.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    // get user repository reference
    @Autowired
    private UserRepository userRepository;
    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

    @Override
    public boolean loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null) return password.equals(user.getPassword());
        return false;
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
