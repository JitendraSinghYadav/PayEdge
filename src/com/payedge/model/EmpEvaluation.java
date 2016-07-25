package com.payedge.model;

public class EmpEvaluation {
	private String empId;
	private long goalNumber;
	private String empComment;
	private int empRate;
	private String mgrComment;
	private int  mgrRate;
	private boolean empConfirmed;
	private boolean mgrConfirmed;
	private boolean hrConfirmed;
	
	public EmpEvaluation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmpEvaluation(String empId, long goalNumber, String empComment,
			int empRate, String mgrComment, int mgrRate, boolean empConfirmed,
			boolean mgrConfirmed, boolean hrConfirmed) {
		super();
		this.empId = empId;
		this.goalNumber = goalNumber;
		this.empComment = empComment;
		this.empRate = empRate;
		this.mgrComment = mgrComment;
		this.mgrRate = mgrRate;
		this.empConfirmed = empConfirmed;
		this.mgrConfirmed = mgrConfirmed;
		this.hrConfirmed = hrConfirmed;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public long getGoalNumber() {
		return goalNumber;
	}
	public void setGoalNumber(long goalNumber) {
		this.goalNumber = goalNumber;
	}
	public String getEmpComment() {
		return empComment;
	}
	public void setEmpComment(String empComment) {
		this.empComment = empComment;
	}
	public int getEmpRate() {
		return empRate;
	}
	public void setEmpRate(int empRate) {
		this.empRate = empRate;
	}
	public String getMgrComment() {
		return mgrComment;
	}
	public void setMgrComment(String mgrComment) {
		this.mgrComment = mgrComment;
	}
	public int getMgrRate() {
		return mgrRate;
	}
	public void setMgrRate(int mgrRate) {
		this.mgrRate = mgrRate;
	}
	public boolean isEmpConfirmed() {
		return empConfirmed;
	}
	public void setEmpConfirmed(boolean empConfirmed) {
		this.empConfirmed = empConfirmed;
	}
	public boolean isMgrConfirmed() {
		return mgrConfirmed;
	}
	public void setMgrConfirmed(boolean mgrConfirmed) {
		this.mgrConfirmed = mgrConfirmed;
	}
	public boolean isHrConfirmed() {
		return hrConfirmed;
	}
	public void setHrConfirmed(boolean hrConfirmed) {
		this.hrConfirmed = hrConfirmed;
	}
	@Override
	public String toString() {
		return "EmpEvaluation [empId=" + empId + ", goalNumber=" + goalNumber
				+ ", empComment=" + empComment + ", empRate=" + empRate
				+ ", mgrComment=" + mgrComment + ", mgrRate=" + mgrRate
				+ ", empConfirmed=" + empConfirmed + ", mgrConfirmed="
				+ mgrConfirmed + ", hrConfirmed=" + hrConfirmed + "]";
	}
    	

}
