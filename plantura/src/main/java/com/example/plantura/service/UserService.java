package com.example.plantura.service;

import java.util.List;

import com.example.plantura.model.User;

public interface UserService {

    public User saveUser(User user);

    public List<User> getAllUser();
    public void deleteAllUsers();
}