package com.archidel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archidel.dao.UserDao;
import com.archidel.gs.bean.User;
import com.archidel.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    
    @Override
    public void addUser(User user) {
	userDao.addUser(user);
    }

    @Override
    public User getUserById(int id) {
	return userDao.getUserById(id);
    }

    @Override
    public List<User> getUserList() {
	return userDao.getUserList();
    }

}
