package com.johanan.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.johanan.license.models.License;
import com.johanan.license.repositories.LicenseRepository;

@Service
public class LicenseService {
	private LicenseRepository lRepos;

	public LicenseService(LicenseRepository lRepos) {
		this.lRepos = lRepos;
	}
	public List<License> allPeople(){
		return this.lRepos.findAll();
	}
	public License getOneLicense(Long id) {
		return this.lRepos.findById(id).orElse(null);
	}
	public License createL(License newL) {
		return this.lRepos.save(newL);
	}
	public License update(License updateL) {
		return this.lRepos.save(updateL);
	}
}
