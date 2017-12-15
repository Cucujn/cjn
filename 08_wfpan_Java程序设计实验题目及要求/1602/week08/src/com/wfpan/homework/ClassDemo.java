package com.wfpan.homework;

import java.util.Arrays;

public class ClassDemo {
	private String className;
	private Student[] stus;
	public ClassDemo() {
		super();
	}
	
	public ClassDemo(String className, Student[] stus) {
		super();
		this.className = className;
		this.stus = stus;
	}
	
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Student[] getStus() {
		return stus;
	}

	public void setStus(Student[] stus) {
		this.stus = stus;
	}
	@Override
	public String toString() {
		return "ClassDemo [className=" + className + ", stus=" + Arrays.toString(stus) + "]";
	}


	

}
