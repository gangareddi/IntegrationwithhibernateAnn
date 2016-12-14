package com.integrationwithhibernate;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public class Dao {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
//	public void insert(Creating creating){
//		hibernateTemplate.save(creating);
//	}
//	
//
//	public void update(Creating creating) {
//		// TODO Auto-generated method stub
//		hibernateTemplate.update(creating);
//	}

	public void delete(Creating creating) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(creating);
		
	}
   
}		

