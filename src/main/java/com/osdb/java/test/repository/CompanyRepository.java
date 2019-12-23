package com.osdb.java.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osdb.java.test.model.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
