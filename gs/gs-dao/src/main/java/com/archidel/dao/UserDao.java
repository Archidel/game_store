package com.archidel.dao;

import java.util.List;

import com.archidel.gs.bean.User;

public interface UserDao {
    void addUser(User user);
    User getUserById(int id);
    List<User> getUserList();
}
