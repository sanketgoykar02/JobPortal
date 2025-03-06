package com.jobportal.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DBRef;

@Document(collection = "jobs")
public class Jobs {
    @Id
    private String jobId;
    private String jTitle;
    private String jDescription;
    private String jLocation;
    private Double salary;

    @DBRef
    private Candidate candidate; // Many-to-One 

    @DBRef
    private Company company; // Many-to-One 

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public String getjTitle() {
		return jTitle;
	}

	public void setjTitle(String jTitle) {
		this.jTitle = jTitle;
	}

	public String getjDescription() {
		return jDescription;
	}

	public void setjDescription(String jDescription) {
		this.jDescription = jDescription;
	}

	public String getjLocation() {
		return jLocation;
	}

	public void setjLocation(String jLocation) {
		this.jLocation = jLocation;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Candidate getCandidate() {
		return candidate;
	}

	public void setCandidate(Candidate candidate) {
		this.candidate = candidate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

    
}
