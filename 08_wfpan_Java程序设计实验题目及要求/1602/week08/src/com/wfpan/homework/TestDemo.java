package com.wfpan.homework;

import java.util.Arrays;

public class TestDemo {
	public static void main(String[] args) {
		ClassDemo cd = new ClassDemo();
		cd.setClassName("Èí¼þ16");
		Student[] stus = new Student[5];
		stus[0] = new Student("", 18, new float[] {1,2,3,4,5,6});
		stus[1] = new Student("", 18, new float[] {1,2,3,4,5,6});
		stus[2] = new Student("", 18, new float[] {1,2,3,4,5,6});
		stus[3] = new Student("", 18, new float[] {1,2,3,4,5,6});
		stus[4] = new Student("", 18, new float[] {1,2,3,4,5,6});
		
		cd.setStus(stus);;
		
		Arrays.sort(stus);
		
	}
	
}
