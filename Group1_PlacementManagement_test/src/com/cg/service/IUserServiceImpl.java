package com.cg.service;

import java.util.Scanner;

import com.cg.entities.User;
import com.cg.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService
{
	private IUserRepositoryImpl dao;
	Scanner s=new Scanner(System.in);
	

	public IUserServiceImpl() {
		dao=new IUserRepositoryImpl();
	}
	

	@Override
	public User addNewUser(User user) {
		User u1 = new User();
		try {
		dao.beginTransaction();
		u1 = dao.addNewUser(user);
		} catch(Exception ex) 
		{
			throw ex;
		} finally {
			dao.commitTransaction();
		}
		return u1;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		System.out.println("Enter the user name:");
		String uname=s.nextLine();
		System.out.println("Enter the Password :");
		String upsw=s.nextLine();
		System.out.println("Id: "+ user.getId());
		User user1 = this.findUser(user);
		if(user1 != null && uname.equals(user1.getName()) && upsw.equals(user1.getPassword())) {
			System.out.println("User found.......");
			return user1;
			
		}
		else {
			System.out.println("Invalid user name or password :");
			return null;
		}
	}
	
	@Override
	public boolean logOut() {
		System.out.println("User has been logged out!");
		return true;
	}


	@Override
	public User findUser(User user) {
		try {
		dao.beginTransaction();
		return dao.findUser(user.getId());
		} catch (Exception  ex) {
			throw ex;
		} finally {
			dao.commitTransaction();
		}
	}

}
