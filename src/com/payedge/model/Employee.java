package com.payedge.model;

public class Employee {
	private String empId;
	private String level;
	private String surName;
	private String firstName;
	private String lastName;
	private String gender;
	private int department;
	private int mobileNo;
	private String emailId;
	private String country;
	private double salary;
	public Employee(String empId, String surName, String firstName,
			String lastName, String gender, int department, int mobileNo,
			String emailId, String country, double salary, String level) {
		super();
		this.empId = empId;
		this.surName = surName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.department = department;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.country = country;
		this.salary = salary;
		this.level = level;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDepartment() {
		return department;
	}
	public void setDepartment(int department) {
		this.department = department;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", level=" + level + ", surName="
				+ surName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", department="
				+ department + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", country=" + country + ", salary=" + salary + "]";
	}
	
	
	
	
	

}
