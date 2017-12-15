package com.chenjn.week07;
// ����һ��ѧ���࣬����ѧ�����������䡢�Ա��Լ�6�ſεĳɼ���ʹ�������ţ���
//����һ���༶�࣬�����༶���ƣ�5��ѧ����ʹ�������ţ���
//�ֱ����ÿ�ſε�ƽ���ɼ����ɼ���õ�ѧ������Ϣ���ɼ�����ѧ������Ϣ���������ܳɼ�������������ѧ����

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
		return (this.totalGrade()-o.totalGrade())>0?-1:(this.totalGrade()-o.totalGrade()==0?0:1);//��������
	}
}
