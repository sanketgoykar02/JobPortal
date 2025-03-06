package com.jobportal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "resumes")
public class Resume {
	@Id
	private String resumeId;
	private String candidateId;
	private String resumeContent;

	public String getResumeId() {
		return resumeId;
	}

	public void setResumeId(String resumeId) {
		this.resumeId = resumeId;
	}

	public String getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(String candidateId) {
		this.candidateId = candidateId;
	}

	public String getResumeContent() {
		return resumeContent;
	}

	public void setResumeContent(String resumeContent) {
		this.resumeContent = resumeContent;
	}

}
