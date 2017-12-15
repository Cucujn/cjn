package com.wfpan.week06;

public class EffectiveArea {
	//成员变量和局部的变量
	int salary = 100;
	
	static {
		int sar = 111;
		System.out.println("1 = " + sar);
	}
	
	static {
		int sar = 333;
		{
//			int sar = 222;
			System.out.println("2 = " + sar);
		}
	}
	
	public EffectiveArea(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		int salary = 1000;
		System.out.println(salary);
	}

}
