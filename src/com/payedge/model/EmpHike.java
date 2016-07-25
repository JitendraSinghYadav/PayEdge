package com.payedge.model;

public class EmpHike {
	private String empId;
	private double mgrRateAvg;
	private double hikeValue;
	
	public EmpHike() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpHike(String empId, double mgrRateAvg, double hikeValue) {
		super();
		this.empId = empId;
		this.mgrRateAvg = mgrRateAvg;
		this.hikeValue = hikeValue;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public double getMgrRateAvg() {
		return mgrRateAvg;
	}
	public void setMgrRateAvg(double mgrRateAvg) {
		this.mgrRateAvg = mgrRateAvg;
	}
	public double getHikeValue() {
		return hikeValue;
	}
	public void setHikeValue(double hikeValue) {
		this.hikeValue = hikeValue;
	}
	@Override
	public String toString() {
		return "EmpHike [empId=" + empId + ", mgrRateAvg=" + mgrRateAvg
				+ ", hikeValue=" + hikeValue + "]";
	}  
	
	

}
