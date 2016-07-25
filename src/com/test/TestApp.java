package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.DepartMentDao;
import com.dao.EmployeeDao;
import com.payedge.model.DepartMent;
import com.payedge.model.EmpEvaluation;
import com.payedge.model.EmpHike;
import com.payedge.model.Employee;
import com.payedge.model.Goal;
import com.payedge.model.LevelGoals;

public class TestApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx =new ClassPathXmlApplicationContext("applicationContext.xml");
		EmployeeDao employeeDao = (EmployeeDao)ctx.getBean("daoImp");
		employeeDao.insertGoal(new Goal(101, "Goal 1"));
		employeeDao.insertGoal(new Goal(102, "Goal 2"));
		employeeDao.insertLevelGoals(new LevelGoals("L1", "101"));
		employeeDao.insertLevelGoals(new LevelGoals("L1", "102"));
		DepartMentDao deptdao=(DepartMentDao)ctx.getBean("daoImp2");
		employeeDao.insertEmp(new Employee("20UTS","Mr","Anuj","Dwivedi","Male",20,94784665,"anuj@gmail.com","India",284344.3, "L1"));
		employeeDao.insertEmp(new Employee("21UTS","Mr","Atul","Dwivedi","Male",10,94784666,"atul@gmail.com","India",284344.3, "L1"));
		employeeDao.insertEmp(new Employee("22UTS","Mr","Amar","Dwivedi","Male",30,94784664,"amar@gmail.com","India",284344.3, "L2"));
		deptdao.insertDept(new DepartMent(20,"Manager","Bangalore"));
		deptdao.insertDept(new DepartMent(30,"Manager","Bangalore"));
		deptdao.insertDept(new DepartMent(10,"CEO","Bangalore"));
        employeeDao.fatch();
        System.out.println(employeeDao.getMyGoals("20UTS"));
      /*  employeeDao.inerstEvaluation(new EmpEvaluation("20UST", 101, "completed",4, "improvement", 3, true,true, true));
		employeeDao.insertEmpHike(new EmpHike("20UST", 5.5d, 20));*/
	}


}
