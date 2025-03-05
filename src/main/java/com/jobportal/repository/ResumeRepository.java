package com.jobportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobportal.model.Resume;

public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
