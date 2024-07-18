package com.vismijatech.main.service;

import com.vismijatech.main.entity.User;

public interface UserService {
    public void registerUser(User user);
    public boolean loginUser(String email, String password);
}
