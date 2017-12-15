package com.jnchen.week09;

public class Faculty extends Employee{
	private String workTime;
	private String jibie;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public String getJibie() {
		return jibie;
	}
	public void setJibie(String jibie) {
		this.jibie = jibie;
	}
	@Override
	public String toString() {
		return "Faculty [workTime=" + workTime + ", jibie=" + jibie + "]";
	}
	
}
