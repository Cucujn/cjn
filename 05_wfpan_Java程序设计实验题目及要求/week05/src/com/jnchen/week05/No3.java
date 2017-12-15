package com.jnchen.week05;

import java.util.Arrays;

//定义5个学生的6门课，就各个课程的最大值、最小值
public class No3 {

	public static void main(String[] args) {
		float[] c1 = new float[5];
		float[] c2 = new float[5];
		float[] c3 = new float[5];
		float[] c4 = new float[5];
		float[] c5 = new float[5];
		float[] c6 = new float[5];
		Arrays.sort(c1);
		System.out.println("max="+c1[0]+"min"+c1[c1.length-1]);
	}

}
