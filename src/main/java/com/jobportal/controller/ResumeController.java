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

import com.jobportal.model.Resume;
import com.jobportal.service.ResumeService;

@RestController
@RequestMapping("/resumes")
public class ResumeController {
	
	@Autowired
    private ResumeService service;

    
    @GetMapping
    public ResponseEntity<List<Resume>> getAllResumes() {
        return ResponseEntity.ok(service.getAllResumes());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Resume> getResumeById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getResumeById(id));
    }

    @PostMapping
    public ResponseEntity<Resume> addResume(@RequestBody Resume resume) {
        return ResponseEntity.ok(service.saveResume(resume));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Resume> updateResume(@PathVariable Long id, @RequestBody Resume resume) {
        return ResponseEntity.ok(service.updateResume(id, resume));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteResume(@PathVariable Long id) {
        service.deleteResume(id);
        return ResponseEntity.ok("Resume deleted successfully");
    }
}
