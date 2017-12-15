package com.jnchen.week09;

public class Person {
	private String Name;
	private String Sex;
	private int Age;
	private String Addr;
	private String PhoneNum;
	private String Email;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "Person [Name=" + Name + ", Sex=" + Sex + ", Age=" + Age + ", Addr=" + Addr + ", PhoneNum=" + PhoneNum
				+ ", Email=" + Email + "]";
	}
	
	

}
