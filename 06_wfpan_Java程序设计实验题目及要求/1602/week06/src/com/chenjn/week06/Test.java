package com.chenjn.week06;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		ClassDemo class1 = new ClassDemo();
		Scanner in = new Scanner(System.in);
		Student[] stus = new Student[5];
		stus[0] = new Student("小红",18,"女", new int[] {90,68,87,65,88});
		stus[1] = new Student("小橙",18,"女", new int[] {100,100,100,100,100});
		stus[2] = new Student("小黄",18,"女", new int[] {99,96,66,72,63});
		stus[3] = new Student("小绿",18,"女", new int[] {85,96,96,82,65});
		stus[4] = new Student("小蓝",18,"女", new int[] {85,79,86,86,63});
		class1.setStu(stus);
		class1.setClassName("软件1班");
		float[] ave = new float[6];

		}
		
	
}
