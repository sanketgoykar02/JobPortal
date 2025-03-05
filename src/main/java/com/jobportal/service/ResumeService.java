package com.jobportal.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.jobportal.model.Resume;
import com.jobportal.repository.ResumeRepository;

@Service
public class ResumeService {
    private final ResumeRepository repository;

    public ResumeService(ResumeRepository repository) {
        this.repository = repository;
    }

    public List<Resume> getAllResumes() {
        return repository.findAll();
    }

    public Resume getResumeById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Resume saveResume(Resume resume) {
        return repository.save(resume);
    }

    public Resume updateResume(Long id, Resume resume) {
        resume.setResumeId(id);
        return repository.save(resume);
    }

    public void deleteResume(Long id) {
        repository.deleteById(id);
    }
}
