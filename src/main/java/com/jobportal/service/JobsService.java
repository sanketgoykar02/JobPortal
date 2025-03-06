package com.jobportal.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.model.Jobs;
import com.jobportal.repository.JobsRepository;

@Service
public class JobsService {
	
	@Autowired
    private JobsRepository repository;

    

    public List<Jobs> getAllJobs() {
        return repository.findAll();
    }

    public Jobs getJobById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Jobs saveJob(Jobs job) {
        return repository.save(job);
    }

    public Jobs updateJob(String id, Jobs job) {
        Optional<Jobs> existingJob = repository.findById(id);
        if (existingJob.isPresent()) {
            job.setJobId(id); // Set the existing ID
            return repository.save(job);
        }
        return null; 
    }

    public void deleteJob(String id) {
        repository.deleteById(id);
    }
}
