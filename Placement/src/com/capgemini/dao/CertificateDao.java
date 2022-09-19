package com.capgemini.dao;

import com.capgemini.entities.Certificate;

public interface CertificateDao {
	
	Certificate addCertificate(Certificate certificate);
	Certificate updateCertificate(Certificate certificate);
	Certificate searchCertificate(int cert_id);
	Certificate deleteCertificate(int cert_id);

	public abstract void beginTransaction();
	public abstract void commitTransaction();



}