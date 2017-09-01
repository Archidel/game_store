package com.archidel.dao;

import com.archidel.gs.bean.User;

public interface UserDao {
    User findById(int id);
    User findByProfile(int id);
}
