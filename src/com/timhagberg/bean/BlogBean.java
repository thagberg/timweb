package com.timhagberg.bean;

import java.sql.Date;

public class BlogBean {

	private int blogId;
	private String blogTitle;
	private String blogBody;
	private Date blogDate;
	
	public BlogBean() {
		
	}
	
	public BlogBean(int blogId, String blogTitle, String blogBody, Date blogDate) {
		
		this.blogId    = blogId;
		this.blogTitle = blogTitle;
		this.blogBody  = blogBody;
		this.blogDate  = blogDate;
	}
	
	public int getBlogId() {
		return blogId;
	}
	public void setBlogId(int blogId) {
		this.blogId = blogId;
	}
	public Date getBlogDate() {
		return blogDate;
	}
	public void setBlogDate(Date blogDate) {
		this.blogDate = blogDate;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getBlogBody() {
		return blogBody;
	}
	public void setBlogBody(String blogBody) {
		this.blogBody = blogBody;
	}
}
