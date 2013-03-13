package com.timhagberg.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.timhagberg.bean.WorkExampleBean;

@Transactional
public class HibernateWorkExampleDAO implements WorkExampleDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public WorkExampleBean getWorkExample(int workId) {
		
		Session session = sessionFactory.getCurrentSession();
		WorkExampleBean workExample;
		
		workExample = (WorkExampleBean) session.get("workExample", new Integer(workId));
		
		return workExample;
	}

	@Override
	public List<WorkExampleBean> getWorkExamples() {
		
		Session session = sessionFactory.getCurrentSession();
		List<WorkExampleBean> workExamples;
		
		Query query = session.createQuery("from WorkExampleBean workExample");
		
		workExamples = (List<WorkExampleBean>) query.list();
		
		return workExamples;
	}

}
