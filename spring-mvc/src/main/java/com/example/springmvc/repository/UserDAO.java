package com.example.springmvc.repository;

import com.example.springmvc.model.User;

public interface UserDAO {
    void saveUser(User user);

    User getUserById(Long id);
}
