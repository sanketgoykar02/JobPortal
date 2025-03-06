package com.jobportal.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "companies")
public class Company {
	@Id
	private String cId;
	private String cName;
	private String cAddress;
	private String cIndustry;

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcIndustry() {
		return cIndustry;
	}

	public void setcIndustry(String cIndustry) {
		this.cIndustry = cIndustry;
	}

	
}
