package com.springsecurity.service;

import com.springsecurity.model.User;

public interface UserService {
	User findById(int id);
	User findBySso(String sso);
}
