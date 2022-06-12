package com.cg.repository;

import com.cg.entities.User;

public interface IUserRepository 
{
	User addNewUser(User user);
	User updateUser(User user);
	User deleteUser(int id);
	User findUser(int id);
	
	void beginTransaction() ;
	void commitTransaction();
}
