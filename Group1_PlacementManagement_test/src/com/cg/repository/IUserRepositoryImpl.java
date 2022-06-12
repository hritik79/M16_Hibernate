package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.User;

public class IUserRepositoryImpl implements IUserRepository {
	private EntityManager entityManager;
	
	public IUserRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}

	@Override
	public User addNewUser(User user) {
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(int id) {
		entityManager.remove(id);
		return null;
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
	}

	@Override
	public User findUser(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

}