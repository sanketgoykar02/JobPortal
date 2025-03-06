package com.jobportal.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.jobportal.model.Jobs;


public interface JobsRepository extends MongoRepository<Jobs, String> {
}

