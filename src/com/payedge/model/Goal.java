package com.payedge.model;

public class Goal {
	
	private long goalNumber;
	private String goal;
	
	
	
	public long getGoalNumber() {
		return goalNumber;
	}

	public void setGoalNumber(long goalNumber) {
		this.goalNumber = goalNumber;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public Goal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Goal(long goalNumber, String goal) {
		super();
		this.goalNumber = goalNumber;
		this.goal = goal;
	}
	
	@Override
	public String toString() {
		return "Goal [goalNumber=" + goalNumber + ", goal=" + goal + "]";
	}
}
