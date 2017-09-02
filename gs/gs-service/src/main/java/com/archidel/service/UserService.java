package com.archidel.service;

import java.util.List;

import com.archidel.gs.bean.User;

public interface UserService {
    void addUser(User user);
    User getUserById(int id);
    List<User> getUserList();
}
