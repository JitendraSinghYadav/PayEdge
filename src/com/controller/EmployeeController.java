package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.support.RequestContextUtils;

import com.dao.EmployeeDao;
import com.payedge.model.Employee;

@Controller
public class EmployeeController {
  @RequestMapping(value=("Empolyee.spring"),method=RequestMethod.POST)
	
	public void empDetails(HttpServletRequest request,@ModelAttribute("Empolyee")Employee employee){
	  WebApplicationContext context=RequestContextUtils.getWebApplicationContext(request);
	  EmployeeDao empdao=(EmployeeDao) context.getBean("daoImp");
	  empdao.insertEmp(employee);
	  
  }
	
}	
	

