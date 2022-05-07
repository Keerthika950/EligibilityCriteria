package com.example.demo.module3.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class EligibleJobseeker {
	//@Id
	//@Column(name="JOBSEEKER_ID")
	//private String jobSeekerId;
	
	//@Column(name="COMPANY_ID")
	//private String companyId;
	
	@Id
	private String jobSeekerId;
	private String companyId;
	private float writtenTest;
	private float groupDiscussion;
	private float hr;
	private String remarks;
	private int year;
	public String getJobSeekerId() {
		return jobSeekerId;
	}
	//@OneToOne(mappedBy = "jobEeekerId", cascade= CascadeType.ALL)
	public void setJobSeekerId(String jobSeekerId) {
		this.jobSeekerId = jobSeekerId;
	}
	//@OneToOne(mappedBy = "companyId",cascade= CascadeType.ALL)
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public float getWrittenTest() {
		return writtenTest;
	}
	public void setWrittenTest(float writtenTest) {
		this.writtenTest = writtenTest;
	}
	public float getGroupDiscussion() {
		return groupDiscussion;
	}
	public void setGroupDiscussion(float groupDiscussion) {
		this.groupDiscussion = groupDiscussion;
	}
	public float getHr() {
		return hr;
	}
	public void setHr(float hr) {
		this.hr = hr;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "EligibleJobseeker [jobSeekerId=" + jobSeekerId + ", companyId=" + companyId + ", writtenTest="
				+ writtenTest + ", groupDiscussion=" + groupDiscussion + ", hr=" + hr + ", remarks=" + remarks
				+ ", year=" + year + "]";
	}
	public EligibleJobseeker(String jobSeekerId, String companyId, float writtenTest, float groupDiscussion, float hr,
			String remarks, int year) {
		super();
		this.jobSeekerId = jobSeekerId;
		this.companyId = companyId;
		this.writtenTest = writtenTest;
		this.groupDiscussion = groupDiscussion;
		this.hr = hr;
		this.remarks = remarks;
		this.year = year;
	}
	public EligibleJobseeker() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
