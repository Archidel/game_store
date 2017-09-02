package com.archidel.dao.imlp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.archidel.dao.UserDao;
import com.archidel.gs.bean.User;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser(User user) {
	System.out.println("add user in dao");
    }

    @Override
    public User getUserById(int id) {
	System.out.println("get user by id in dao");
	
	return null;
    }

    @Override
    public List<User> getUserList() {
	List<User> list = new ArrayList<>();
	list.add(new User(1, "Albert", "myPassword"));
	list.add(new User(2, "Nikita", "hispassword"));
	list.add(new User(3, "Jeka", "myPassword"));
	list.add(new User(4, "aOMG", "myPassword"));
	return list;
    }

}
