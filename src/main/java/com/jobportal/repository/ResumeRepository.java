package com.jobportal.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobportal.model.Resume;

public interface ResumeRepository extends MongoRepository<Resume, String> {
}
