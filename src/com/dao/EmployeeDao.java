package com.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.payedge.model.EmpEvaluation;
import com.payedge.model.EmpHike;
import com.payedge.model.Employee;
import com.payedge.model.Goal;
import com.payedge.model.LevelGoals;



public class EmployeeDao extends HibernateDaoSupport {

	public EmployeeDao(){
		super();
	}
	public Employee insertEmp(Employee employee){
		getHibernateTemplate().save(employee);
		return employee;
	}
	public List<Employee> fatch(){
		List<Employee> listOfEmp = new ArrayList<Employee>();
		listOfEmp = (List<Employee>)getHibernateTemplate().find("from Employee e");
		System.out.println(listOfEmp);
		return listOfEmp;
	}

	public void insertGoal(Goal goals){
		getHibernateTemplate().save(goals);
	}

	public void insertLevelGoals(LevelGoals levelGoals){
		getHibernateTemplate().save(levelGoals);
	}

	/*public List<Goal> getMyGoals(String empID){
		List<Goal> goalList = null;
		goalList = (List<Goal>)getHibernateTemplate().find("from Goal as goal where goal.goalNumber in (select levelGoals.goalNumber from LevelGoals as levelGoals where levelGoals.level = (select emp.level from Employee as emp where emp.empId = ?)",empID);
		return goalList;
	}*/
	public List<Goal> getMyGoals(String empID){
		List<Employee> employeeList = null;
		List<LevelGoals> levelGoalsList = null;
		List<Goal> goalList = new ArrayList<Goal>();
		employeeList = getHibernateTemplate().find("from Employee emp where emp.empId=?", empID);
		System.out.println(employeeList);
		levelGoalsList = getHibernateTemplate().find("from LevelGoals lg where lg.level=?", employeeList.get(0).getLevel());
		System.out.println(levelGoalsList);
		for (LevelGoals levelGoals : levelGoalsList) {
			goalList.add((Goal)getHibernateTemplate().find("from Goal g where g.goalNumber=?)", Long.parseLong(levelGoals.getGoalNumber())).get(0));
		}
		System.out.println(goalList);
		return goalList;
	}
	/*public void inerstEvaluation(EmpEvaluation empEvaluation){
		getHibernateTemplate().save(empEvaluation);
	}
	public void insertEmpHike(EmpHike empHike){
		getHibernateTemplate().save(empHike);
	}*/
	

}
