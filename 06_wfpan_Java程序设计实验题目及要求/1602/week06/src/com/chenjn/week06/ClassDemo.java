package com.chenjn.week06;

import java.util.Arrays;

public class ClassDemo {
	public String className;
	public Student[] stu;
	public ClassDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Student[] getStu() {
		return stu;
	}
	public void setStu(Student[] stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "ClassDemo [className=" + className + ", stu=" + Arrays.toString(stu) + "]";
	}
	
	
}
