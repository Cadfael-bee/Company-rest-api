package com.osdb.java.test.service;

import java.util.List;

import com.osdb.java.test.model.Company;

public interface CompanyService {
	
	List<Company> getAll();
	
	Company add(Company company);

}
