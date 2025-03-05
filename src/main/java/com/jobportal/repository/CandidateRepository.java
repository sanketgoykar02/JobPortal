package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
