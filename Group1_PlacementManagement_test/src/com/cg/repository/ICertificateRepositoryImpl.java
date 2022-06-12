package com.cg.repository;

import javax.persistence.EntityManager;

import com.cg.entities.Certificate;

public class ICertificateRepositoryImpl implements ICertificateRepository {
	
	//Step 1: Start JPA LifeCycle
	private EntityManager entityManager;
	
	public ICertificateRepositoryImpl() {
		entityManager=JPAUtil.getEntityManager();
	}
	//Create operation - Repo/DAO
	@Override
	public Certificate addCertificate(Certificate certificate) {
		entityManager.persist(certificate);
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		entityManager.merge(certificate);
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate=entityManager.find(Certificate.class, id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
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

}