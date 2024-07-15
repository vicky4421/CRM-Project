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
    public boolean registerUser(User user) {
        try{
            userRepository.save(user);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null) return password.equals(user.getPassword());
        return false;
    }
}
