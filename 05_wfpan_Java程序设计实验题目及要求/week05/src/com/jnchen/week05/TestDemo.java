package com.jnchen.week05;

//import java.util.Scanner;

public class TestDemo {
	public static void mian(String[] args) {
		float[][] stu = new float[5][6];

		//输入学生的成绩
		for(int i = 0;i<5;i++) {
			System.out.println("请输入第"+i+"个学生的成绩");
			for(int j = 0;j<6;j++) {
				stu[i][j] = 1+(float)(Math.random()*99);
			}
		}
		for(int i = 0;i<5;i++) {
			System.out.println("第"+i+"个学生的成绩");
			for(int j = 0;j<6;j++) {
				System.out.print(stu[i][j]+"   ");
			}
		}
		
		
		
	}
	
}
