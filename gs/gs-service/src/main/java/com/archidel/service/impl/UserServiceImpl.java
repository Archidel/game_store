package com.archidel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.archidel.dao.UserDao;
import com.archidel.gs.bean.User;
import com.archidel.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao dao;
    
    @Override
    public User findById(int id) {
	return dao.findById(id);
    }

    @Override
    public User findByProfile(int id) {
	return dao.findByProfile(id);
    }

}
