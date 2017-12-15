package com.jnchen.week05;

public class Student {
	public static void main(String[] args) {
		float[][] stu = new float[5][6];

		//输入学生的成绩
		for(int i = 0;i<5;i++) {
//			System.out.println("请输入第"+i+"个学生的成绩");
			for(int j = 0;j<6;j++) {
				stu[i][j] = 1+(float)(Math.random()*99);
			}
		}
		for(int i = 0;i<5;i++) {
			System.out.println("第"+(i+1)+"个学生的成绩");
			for(int j = 0;j<6;j++) {
				System.out.print(stu[i][j]+"   ");
			}
			System.out.print("\n");
		}
		float max, min;
		int m=0,n=0;
		for(int i=0;i<6;i++) {
			max = 0;
			min = 1000;
			for(int j=0;j<5;j++) {
				if(stu[j][i]>=max) {
					max = stu[j][i];
					m = j;
				}
				if(stu[j][i]<=min) {
					min = stu[j][i];
					n = j;
				}
			}
			System.out.println("第"+(i+1)+"门课的：");
			System.out.println("最大成绩为"+max+"学生序号为"+(m+1));
			System.out.println("最小成绩为"+min+"学生序号为"+(n+1));
		}
		
	}
}
