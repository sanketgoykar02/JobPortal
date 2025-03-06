package com.jobportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.model.Candidate;
import com.jobportal.repository.CandidateRepository;

@Service
public class CandidateService {

	@Autowired
	private CandidateRepository repository;

	public List<Candidate> getAllCandidates() {
		return repository.findAll();
	}

	public Candidate getCandidateById(String id) {
		return repository.findById(id).orElse(null);
	}

	public Candidate saveCandidate(Candidate candidate) {
		return repository.save(candidate);
	}

	public Candidate updateCandidate(String id, Candidate candidate) {
		candidate.setId(id);
		return repository.save(candidate);
	}

	public void deleteCandidate(String id) {
		repository.deleteById(id);
	}
}
