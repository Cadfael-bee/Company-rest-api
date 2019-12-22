package com.osdb.java.test.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.osdb.java.test.model.Company;
import com.osdb.java.test.service.CompanyService;

import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/company")
@AllArgsConstructor
public class CompanyController {

	private final CompanyService companyService;

	@GetMapping("/")
	@ApiOperation(value = "Finds all the companies", response = List.class)
	public List<Company> getAllCompanies() {
		return companyService.getAll();
	}

	@PostMapping("/")
	@ApiOperation(value = "Adds a new company", response = Company.class)
	public Company addCompany(@RequestBody Company company) {
		return companyService.add(company);
	}

}
