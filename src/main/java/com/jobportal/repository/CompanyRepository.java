package com.jobportal.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
}

