package com.jobportal.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.model.Job;
import com.jobportal.repository.JobRepository;

@Service
public class JobService {
	
	@Autowired
    private JobRepository repository;

  

    public List<Job> getAllJobs() {
        return repository.findAll();
    }

    public Job getJobById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Job saveJob(Job job) {
        return repository.save(job);
    }

    public Job updateJob(Long id, Job job) {
        job.setJobId(id);
        return repository.save(job);
    }

    public void deleteJob(Long id) {
        repository.deleteById(id);
    }
}

