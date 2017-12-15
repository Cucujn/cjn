package com.wfpan.week05;

import java.util.Arrays;

public class ForEachDemo {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		//a = int x
		System.out.println("数组a:");
		for(int x:a) {
			System.out.println(x);
		}
		
		//js: for(var x in a)
		
		int[][] b = new int[3][4];
		System.out.println("数组b:");
		for(int[] x:b) {
			for(int y:x) {
				System.out.println(y);
			}
		}
//		get();
//		int ax =getAge();
//		Arrays.copyOf(original, newLength);
//		D.wangwang();
		
	}
	public static void getAge() {
		//结束函数的执行，返回到主调函数，如果有值带回值
//		return 1;
		
	}

}
