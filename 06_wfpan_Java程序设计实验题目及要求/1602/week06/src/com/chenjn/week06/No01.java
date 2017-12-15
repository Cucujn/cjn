package com.chenjn.week06;

import java.util.Scanner;

public class No01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = in.nextInt();
		System.out.println(jiecheng(n));
	}
	public static int jiecheng(int n) {
		if(n==1) {
			return 1;
		} else {
			return n*jiecheng(n-1);
		}
	}
}
