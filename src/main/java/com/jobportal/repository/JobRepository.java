package com.jobportal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.Job;

public interface JobRepository extends JpaRepository<Job, Long> {
}
