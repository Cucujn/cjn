package com.wfpan.homework;

import java.util.Arrays;

public class Student implements Comparable<Student>{
	private String stuName;
	private int stuAge;
	private float[] scores;

	public Student() {
		super();
	}

	public Student(String stuName, int stuAge, float[] scores) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.scores = scores;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public int getStuAge() {
		return stuAge;
	}

	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}

	public float[] getScores() {
		return scores;
	}

	public void setScores(float[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge + ", scores=" + Arrays.toString(scores) + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.scores[1]-o.scores[0]>0?1:-1;
	}
	
	
	
	
}
