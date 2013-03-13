package com.timhagberg.servlet;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.timhagberg.bean.BlogBean;
import com.timhagberg.misc.BlogException;
import com.timhagberg.misc.CharacterFilter;
import com.timhagberg.model.BlogDAO;

@RequestMapping
@Controller
public class BlogController {

	private BlogDAO blogDao;
	
	@RequestMapping(value="/blog")
	public String getBlog() {
		
		return "blog";
	}
	
	@RequestMapping(value="/blog/{blogTitle}", method=RequestMethod.GET)
	public String getBlog(@PathVariable String blogTitle, Model model) {
		
		BlogBean blog;
		String forward = "blog";
		
		// if a blogTitle request param exists, we will find that blog and add it to the model
		// this will cause that full blog to be rendered rather than the blog previews
		if (null != blogTitle && !blogTitle.trim().equals("")) {
			// remove any special characters which may represent a security risk
			blogTitle = CharacterFilter.filterInput(blogTitle);
			try {
				blog = blogDao.getBlogByTitle(blogTitle);
				model.addAttribute("blog", blog);
			} catch (BlogException be) {
				//TODO: add logging here
				be.printStackTrace();
				forward = "home";
			}
		}
		
		return forward;
	}
	
	@RequestMapping(value="/blogPreview", method=RequestMethod.GET)
	public @ResponseBody List<BlogBean> getBlogPreviews() {
		
		List<BlogBean> previews = blogDao.getBlogPreviews();
		
		// trim the blog previews down
		for (BlogBean blog : previews) {
			blog.setBlogBody(trimForPreview(blog.getBlogBody()));
		}
		
		return previews;
	}

	public BlogDAO getBlogDao() {
		return blogDao;
	}

	public void setBlogDao(BlogDAO blogDao) {
		this.blogDao = blogDao;
	}
	
	private String trimForPreview(String blogBody) {
		
		blogBody = blogBody.substring(0, 500) + "...";
		
		return blogBody;
	}
}
