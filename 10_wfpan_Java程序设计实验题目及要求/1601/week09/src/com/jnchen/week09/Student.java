package com.jnchen.week09;

public class Student extends Person{
	private final String State1 = "��һ";
	private final String State2 = "���";
	private final String State3 = "����";
	private final String State4 = "����";
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getState1() {
		return State1;
	}
	public String getState2() {
		return State2;
	}
	public String getState3() {
		return State3;
	}
	public String getState4() {
		return State4;
	}
	@Override
	public String toString() {
		return "Student [State1=" + State1 + ", State2=" + State2 + ", State3=" + State3 + ", State4=" + State4 + "]";
	}
	
}
