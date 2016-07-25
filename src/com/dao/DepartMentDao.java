package com.dao;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.payedge.model.DepartMent;


public class DepartMentDao extends HibernateDaoSupport {
	public DepartMentDao(){
		  super();
	  }
	  public DepartMent insertDept(DepartMent dept){
		  getHibernateTemplate().save(dept);
		  return dept;
	  }
	

}
