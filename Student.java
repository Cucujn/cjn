package com.jnchen.homework;

public class Student extends Person{
	public static final String classState1 = "��һ" ;
	public static final String classState2 = "���" ;
	public static final String classState3 = "����" ;
	public static final String classState4 = "����" ;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String getClassstate1() {
		return classState1;
	}

	public static String getClassstate2() {
		return classState2;
	}

	public static String getClassstate3() {
		return classState3;
	}

	public static String getClassstate4() {
		return classState4;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}
	

	
	
}
