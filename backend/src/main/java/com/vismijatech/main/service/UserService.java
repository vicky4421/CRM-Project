package com.vismijatech.main.service;

import com.vismijatech.main.entity.User;

public interface UserService {
    public boolean registerUser(User user);
    public boolean loginUser(String email, String password);
}
