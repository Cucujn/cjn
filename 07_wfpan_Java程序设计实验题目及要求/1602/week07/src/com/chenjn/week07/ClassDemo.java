package com.chenjn.week07;
//定义一个学生类，包含学生姓名、年龄、性别，以及6门课的成绩（使用数组存放）；
//定义一个班级类，包含班级名称，5个学生（使用数组存放）。实现学生按照总成绩排名，并输出排名后的学生信息。
import java.util.ArrayList;

public class ClassDemo {
	private String className;
	private ArrayList<Student> stu;
	
	public ClassDemo(String className, ArrayList<Student> stu) {
		super();
		this.className = className;
		this.stu = stu;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public ArrayList<Student> getStu() {
		return stu;
	}
	public void setStu(ArrayList<Student> stu) {
		this.stu = stu;
	}
	@Override
	public String toString() {
		return "ClassDemo [className=" + className + ", stu=" + stu + "]";
	}
	
	
}
