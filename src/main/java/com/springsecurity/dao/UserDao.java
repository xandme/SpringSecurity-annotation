package com.springsecurity.dao;

import com.springsecurity.model.User;

public interface UserDao {
	User findById(int id);
	User findBySSO(String sso);
}
