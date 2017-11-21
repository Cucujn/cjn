package com.jnchen.homework;

public class Faculty extends Employee{
	public String time;
	public String jibie;
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(String time,String jibie) {
		super();
		this.time = time;
		this.jibie = jibie;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getJibie() {
		return jibie;
	}
	public void setJibie(String jibie) {
		this.jibie = jibie;
	}
	@Override
	public String toString() {
		return "Faculty [time=" + time + ", jibie=" + jibie + ", address=" + address + ", phoneNumber=" + phoneNumber
				+ ", email=" + email + ", office=" + office + ", salary=" + salary + ", date=" + date + ", name=" + name
				+ ", sex=" + sex + ", age=" + age + "]";
	}
	
}
