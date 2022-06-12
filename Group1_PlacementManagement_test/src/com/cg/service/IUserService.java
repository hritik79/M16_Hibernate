package com.cg.service;

import com.cg.entities.User;

public interface IUserService {
	User addNewUser(User user);
	User updateUser(User user);
	User login(User user);
	User findUser(User user);
	boolean logOut();
}
