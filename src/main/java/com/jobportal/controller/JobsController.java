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

import com.jobportal.model.Jobs;
import com.jobportal.service.JobsService;

@RestController
@RequestMapping("/jobs") 
public class JobsController {
	
	@Autowired
	private  JobsService service;

	@GetMapping
	public ResponseEntity<List<Jobs>> getAllJobs() {
		return ResponseEntity.ok(service.getAllJobs());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Jobs> getJobById(@PathVariable String id) {
		Jobs job = service.getJobById(id);
		return (job != null) ? ResponseEntity.ok(job) : ResponseEntity.notFound().build();
	}

	@PostMapping
	public ResponseEntity<Jobs> addJob(@RequestBody Jobs job) {
		return ResponseEntity.ok(service.saveJob(job));
	}

	@PutMapping("/{id}")
	public ResponseEntity<Jobs> updateJob(@PathVariable String id, @RequestBody Jobs job) {
		Jobs updatedJob = service.updateJob(id, job);
		return (updatedJob != null) ? ResponseEntity.ok(updatedJob) : ResponseEntity.notFound().build();
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteJob(@PathVariable String id) {
		service.deleteJob(id);
		return ResponseEntity.ok("Job deleted successfully");
	}
}
