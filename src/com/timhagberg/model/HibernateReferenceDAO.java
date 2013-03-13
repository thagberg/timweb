package com.timhagberg.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.timhagberg.bean.ReferenceBean;
import com.timhagberg.misc.CharacterFilter;

@Transactional
public class HibernateReferenceDAO implements ReferenceDAO {

	private SessionFactory sessionFactory;
	
	@Override
	public ReferenceBean getReferenceById(int referenceId) {
	
		ReferenceBean reference;
		Session session = sessionFactory.getCurrentSession();
		
		reference = (ReferenceBean) session.get("reference", new Integer(referenceId));		
		reference.setReferenceBody(CharacterFilter.filterOutput(reference.getReferenceBody()));
		
		return reference;
	}

	@Override
	public List<ReferenceBean> getReferences() {
		
		List<ReferenceBean> references;
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("select reference from ReferenceBean reference");
		
		references = (List<ReferenceBean>) query.list();
		for (ReferenceBean ref : references) {
			ref.setReferenceBody(CharacterFilter.filterOutput(ref.getReferenceBody()));
		}
		
		return references;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
