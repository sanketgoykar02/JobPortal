package com.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.model.Company;
import com.jobportal.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
    private CompanyRepository repository;


    public List<Company> getAllCompanies() {
        return repository.findAll();
    }

    public Company getCompanyById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Company saveCompany(Company company) {
        return repository.save(company);
    }

    public Company updateCompany(Long id, Company company) {
        company.setCId(id);
        return repository.save(company);
    }

    public void deleteCompany(Long id) {
        repository.deleteById(id);
    }
}

