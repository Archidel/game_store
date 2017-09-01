package com.archidel.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.archidel.dao.AbstractDao;
import com.archidel.dao.UserDao;
import com.archidel.gs.bean.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Integer, User> implements UserDao{

    @Override
    public User findById(int id) {
	return getByKey(id);
    }

    @Override
    public User findByProfile(int id) {
	Criteria criteria = createEntityCriteria();
	criteria.add(Restrictions.eq("up_id", id));
	return (User) criteria.uniqueResult();
    }

}
