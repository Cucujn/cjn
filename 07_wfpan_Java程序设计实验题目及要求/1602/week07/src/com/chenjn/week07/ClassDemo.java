package com.chenjn.week07;
//����һ��ѧ���࣬����ѧ�����������䡢�Ա��Լ�6�ſεĳɼ���ʹ�������ţ���
//����һ���༶�࣬�����༶���ƣ�5��ѧ����ʹ�������ţ���ʵ��ѧ�������ܳɼ�������������������ѧ����Ϣ��
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
