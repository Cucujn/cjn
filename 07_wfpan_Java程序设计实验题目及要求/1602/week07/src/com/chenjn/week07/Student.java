package com.chenjn.week07;
// 定义一个学生类，包含学生姓名、年龄、性别，以及6门课的成绩（使用数组存放）；
//定义一个班级类，包含班级名称，5个学生（使用数组存放）。
//分别输出每门课的平均成绩、成绩最好的学生的信息、成绩最差的学生的信息，并按照总成绩降序排列所有学生。

import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Comparable<Student>{
	private String name;
	private int age;
	private String sex;
	private ArrayList<Float> score;
	
	public Student(String name, int age, String sex, ArrayList<Float> score) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.score = score;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public ArrayList<Float> getScore() {
		return score;
	}
	public void setScore(ArrayList<Float> score) {
		this.score = score;
	}
	public float totalGrade() {
		float sum = 0.0f;
		for(int i = 0;i<score.size();i++) {
			sum += score.get(i);
		}
		return sum;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", score=" + score + "]";
	}
	@Override
	public int compareTo(Student o) {
		return (this.totalGrade()-o.totalGrade())>0?-1:(this.totalGrade()-o.totalGrade()==0?0:1);//降序排序
	}
}
