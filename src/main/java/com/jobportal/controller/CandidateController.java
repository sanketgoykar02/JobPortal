package com.jobportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobportal.model.Candidate;
import com.jobportal.service.CandidateService;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

	@Autowired
	private CandidateService service;

	@GetMapping
	public ResponseEntity<List<Candidate>> getAllCandidates() {
		return ResponseEntity.ok(service.getAllCandidates());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Candidate> getCandidateById(@PathVariable Long id) {
		return ResponseEntity.ok(service.getCandidateById(id));
	}

	@PostMapping
	public ResponseEntity<Candidate> addCandidate(@RequestBody Candidate candidate) {
		return ResponseEntity.ok(service.saveCandidate(candidate));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Candidate> updateCandidate(@PathVariable Long id, @RequestBody Candidate candidate) {
		return ResponseEntity.ok(service.updateCandidate(id, candidate));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCandidate(@PathVariable Long id) {
		service.deleteCandidate(id);
		return ResponseEntity.ok("Candidate deleted successfully");
	}
}
