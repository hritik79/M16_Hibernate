package com.cg.service;

import com.cg.entities.Certificate;
import com.cg.repository.ICertificateRepositoryImpl;
import com.cg.repository.ICertificateRepository;


public class ICertificateServiceImpl implements ICertificateService{
	
	// Step 1; Establishing connection between Service and Repo
		private ICertificateRepository dao;
		
		public ICertificateServiceImpl()
		{
			dao = new ICertificateRepositoryImpl();
		}
		

	@Override
	public Certificate addCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate certificate = dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) {
		dao.beginTransaction();
		Certificate certificate = dao.deleteCertificate(id);
		dao.commitTransaction();
		return certificate;
	}

	

}
