package com.jnchen.week05;

import java.util.Scanner;

//1. 输入两个浮点数交换排序
public class SwitchFloat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("输入a");
		float a = in.nextFloat();
		System.out.println("输入b");
		float b = in.nextFloat();
		Switchfloat(a,b);
		
	}
	private static void Switchfloat(float a , float b ) {
		if(a>=b) {
			System.out.println("按从大到小的顺序排序后"+a+","+b);
		} else {
			System.out.println("按从大到小的顺序排序后"+b+","+a);
		}
	}
}
