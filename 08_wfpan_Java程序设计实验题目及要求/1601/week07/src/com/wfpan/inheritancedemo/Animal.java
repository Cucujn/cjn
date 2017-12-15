package com.wfpan.inheritancedemo;

public class Animal {
	private String name = "animal";
	private int age =  18;
	protected String sex = "ÄÐ";

	public Animal() {
		super();
	}
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	protected String to2String() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
}
