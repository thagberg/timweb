package com.timhagberg.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.timhagberg.bean.BlogBean;
import com.timhagberg.misc.BlogException;
import com.timhagberg.misc.CharacterFilter;

@Transactional
public class HibernateBlogDAO implements BlogDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public BlogBean getBlogById(int blogId) {

		BlogBean blog;
		Session session = sessionFactory.getCurrentSession();
		
		blog = (BlogBean) session.get("blog", new Integer(blogId));
		blog.setBlogBody(CharacterFilter.filterOutput(blog.getBlogBody()));
		
		return blog;
	}

	@Override
	public BlogBean getBlogByTitle(String blogTitle) throws BlogException {
		
		List<BlogBean> blogs;
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("select blog from BlogBean blog where blog.blogTitle = :blogTitle");
		query.setParameter("blogTitle", blogTitle);
		blogs = (List<BlogBean>) query.list();
		
		// if there are none or multiple blogs with this title, we have a problem
		if (blogs.size() != 1) {
			throw new BlogException();
		}
		
		// only one blog, so return the top
		blogs.get(0).setBlogBody(CharacterFilter.filterOutput(blogs.get(0).getBlogBody()));
		return blogs.get(0);
	}
	
	@Override
	public List<BlogBean> getBlogPreviews() {
		
		List<BlogBean> previews;		
		Session session = sessionFactory.getCurrentSession();

		Query query = session.createQuery("" +
				"from BlogBean blog");
		previews = (List<BlogBean>) query.list();
		
		return previews;
	}

}
