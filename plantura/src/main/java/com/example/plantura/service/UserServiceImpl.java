package com.example.plantura.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.plantura.model.User;
import com.example.plantura.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userrepo;

    @Override
    public User saveUser(User user) {
        return userrepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userrepo.findAll();
    }
    @Override
    public void deleteAllUsers() {
        userrepo.deleteAll(); // Implementation for deleting all users
    }
}
