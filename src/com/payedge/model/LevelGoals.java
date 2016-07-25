package com.payedge.model;

import java.io.Serializable;

public class LevelGoals implements Serializable {
	private String level;
	private String goalNumber;
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getGoalNumber() {
		return goalNumber;
	}

	public void setGoalNumber(String goalNumber) {
		this.goalNumber = goalNumber;
	}

	public LevelGoals() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LevelGoals(String level, String goalNumber) {
		super();
		this.level = level;
		this.goalNumber = goalNumber;
	}

	@Override
	public String toString() {
		return "LevelGoals [level=" + level + ", goalNumber=" + goalNumber
				+ "]";
	}

	
	
	
}
