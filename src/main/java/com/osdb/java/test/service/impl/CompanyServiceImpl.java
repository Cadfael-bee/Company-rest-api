package com.osdb.java.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.osdb.java.test.model.Company;
import com.osdb.java.test.repository.CompanyRepository;
import com.osdb.java.test.service.CompanyService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CompanyServiceImpl implements CompanyService{
	
	private final CompanyRepository companyRepository;

	@Override
	public List<Company> getAll() {
		return companyRepository.findAll();
	}

	@Override
	public Company add(Company company) {
		return companyRepository.save(company);
	}
	
}
