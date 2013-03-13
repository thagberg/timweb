package com.timhagberg.bean;

public class WorkExampleBean {

	private int workId;
	private String workName;
	private String workDescription;
	private String workImageLocation;
	private String workVideoLocation;
	private String workDownloadLocation;
	private String category;
	
	public WorkExampleBean() {
		
	}
	
	public WorkExampleBean(int workId, String workName, String workDescription,
			String workImageLocation, String workVideoLocation,
			String workDownloadLocation, String category) {
		super();
		this.workId = workId;
		this.workName = workName;
		this.workDescription = workDescription;
		this.workImageLocation = workImageLocation;
		this.workVideoLocation = workVideoLocation;
		this.workDownloadLocation = workDownloadLocation;
		this.category = category;
	}
	public int getWorkId() {
		return workId;
	}
	public void setWorkId(int workId) {
		this.workId = workId;
	}
	public String getWorkName() {
		return workName;
	}
	public void setWorkName(String workName) {
		this.workName = workName;
	}
	public String getWorkDescription() {
		return workDescription;
	}
	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}
	public String getWorkImageLocation() {
		return workImageLocation;
	}
	public void setWorkImageLocation(String workImageLocation) {
		this.workImageLocation = workImageLocation;
	}
	public String getWorkVideoLocation() {
		return workVideoLocation;
	}
	public void setWorkVideoLocation(String workVideoLocation) {
		this.workVideoLocation = workVideoLocation;
	}
	public String getWorkDownloadLocation() {
		return workDownloadLocation;
	}
	public void setWorkDownloadLocation(String workDownloadLocation) {
		this.workDownloadLocation = workDownloadLocation;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}
