package com.archidel.service;

import com.archidel.gs.bean.User;

public interface UserService {
    User findById(int id);
    User findByProfile(int id);
}
