package com.johanan.license.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.johanan.license.models.Person;
import com.johanan.license.repositories.PersonRepository;


@Service
public class PersonService {
	private PersonRepository pRepos;

	public PersonService(PersonRepository pRepos) {
		this.pRepos = pRepos;
	}
	public List<Person> allPeople(){
		return this.pRepos.findAll();
	}
	public List<Person> getUnlicensed(){
		return this.pRepos.findByLicenseIsNull();
	}
	public Person getOnePerson(Long id) {
		return this.pRepos.findById(id).orElse(null);
	}
	public Person createP(Person newP) {
		return this.pRepos.save(newP);
	}
	public Person update(Person updatP) {
		return this.pRepos.save(updatP);
	}
}
