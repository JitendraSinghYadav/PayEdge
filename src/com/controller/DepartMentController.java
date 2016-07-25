package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.dao.DepartMentDao;
import com.payedge.model.DepartMent;

@Controller
public class DepartMentController {
	@RequestMapping(value=("DepartMent.spring"),method=RequestMethod.POST)
	 public void deptDetails(HttpServletRequest request,@ModelAttribute("DepartMent")DepartMent dept){
		WebApplicationContext context=RequestContextUtils.getWebApplicationContext(request);
		 DepartMentDao deptdao=(DepartMentDao) context.getBean("daoImp2");
		 deptdao.insertDept(dept);
	}
	

}
