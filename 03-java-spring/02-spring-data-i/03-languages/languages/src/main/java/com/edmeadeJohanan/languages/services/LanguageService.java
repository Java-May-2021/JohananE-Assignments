package com.edmeadeJohanan.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edmeadeJohanan.languages.models.Language;
import com.edmeadeJohanan.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	public List<Language> allLanguages(){
		return this.lRepo.findAll();
	}
	public Language getOneLang(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	public Language createLang(Language newLang) {
		return this.lRepo.save(newLang);
	}
	public Language updateLang(Language lang) {
		return this.lRepo.save(lang);
	}
	public void delete(Long id) {
		this.lRepo.deleteById(id);
	}
}
