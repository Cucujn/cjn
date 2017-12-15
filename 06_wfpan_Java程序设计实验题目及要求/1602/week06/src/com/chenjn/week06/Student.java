package com.chenjn.week06;

import java.util.Arrays;



public class Student implements Comparable<Student>{
	private String SName;
	private int SAge;
	private String SSex;
	private int[] grade;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name,int age,String SSex,int[] grade) {
		this.SName = name;
		this.SAge = age;
		this.SSex = SSex;
		this.grade = grade;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public int getSAge() {
		return SAge;
	}
	public void setSAge(int sAge) {
		SAge = sAge;
	}
	public String getSSex() {
		return SSex;
	}
	public void setSSex(String sSex) {
		SSex = sSex;
	}
	public int[] getGrade() {
		return grade;
	}
	public void setGrade(int[] grade) {
		this.grade = grade;
	}
	public int getSum(int[] grade) {
		int sum = 0;
		for(int i=0;i<grade.length;i++) {
			sum += grade[i];
		}
		return sum;
	}
	@Override
	public String toString() {
		return "Student [SName=" + SName + ", SAge=" + SAge + ", SSex=" + SSex + ", grade=" + Arrays.toString(grade)
				+ "]";
	}
	public int compareTo(Student o) {
		return this.getSum(grade)-o.getSum(grade)>0?1:-1;
	}
	
	
}
