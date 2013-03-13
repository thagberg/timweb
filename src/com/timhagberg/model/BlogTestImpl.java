package com.timhagberg.model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.timhagberg.bean.BlogBean;
import com.timhagberg.misc.BlogException;

public class BlogTestImpl implements BlogDAO {

	@Override
	public BlogBean getBlogById(int blogId) {
		
		BlogBean testById = new BlogBean();
		testById.setBlogId(blogId);
		testById.setBlogTitle("Test Blog " + testById.getBlogId());
		testById.setBlogBody("This is the body content of a test blog");
		//testById.setBlogDate("12-03-2012");
		
		/*Date testDate;
		SimpleDateFormat testDateFormat = new SimpleDateFormat("dd-mm-yyyy");*/
		
		return testById;
	}

	@Override
	public List<BlogBean> getBlogPreviews() {
		ArrayList<BlogBean> testByPreviews = new ArrayList<BlogBean>();
		
		for (int i = 1; i <= 10; i++) {
			testByPreviews.add(getBlogById(i));
		}
		
		return testByPreviews;
	}

	@Override
	public BlogBean getBlogByTitle(String blogTitle) throws BlogException {
		// TODO Auto-generated method stub
		return null;
	}

}
