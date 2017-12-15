package com.wfpan.week07;

public class Student {
	private String name;
	private int age;
	private String sex;
	private boolean nationality;
	private static Student stu = null;
	
	private Student() {
		super();
	}
	
	public static Student getInstance() {
		if(stu==null) stu = new Student();
		return stu;
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
		if(age<0 || age > 150) {
			System.out.println("ÄãÊÇÍõ°ËÂğ");
		} else {
			this.age = age;
		}
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isNationality() {
		return nationality;
	}
	public void setNationality(boolean nationality) {
		this.nationality = nationality;
	}
	
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(1000);
		
	}
}

class ClassDemo {
	Student stu = Student.getInstance();
	void test() {
		stu.setName("");
		stu.getName();
	}
	
}
