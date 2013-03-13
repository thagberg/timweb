package com.timhagberg.model;

import java.util.List;

import com.timhagberg.bean.BlogBean;
import com.timhagberg.misc.BlogException;

public interface BlogDAO {
	
	public BlogBean getBlogById(int blogId) throws BlogException;
	
	public BlogBean getBlogByTitle(String blogTitle) throws BlogException;
	
	public List<BlogBean> getBlogPreviews();
}
