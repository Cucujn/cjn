package com.jnchen.week05;

import java.util.Scanner;

//1. ����������������������
public class SwitchFloat {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����a");
		float a = in.nextFloat();
		System.out.println("����b");
		float b = in.nextFloat();
		Switchfloat(a,b);
		
	}
	private static void Switchfloat(float a , float b ) {
		if(a>=b) {
			System.out.println("���Ӵ�С��˳�������"+a+","+b);
		} else {
			System.out.println("���Ӵ�С��˳�������"+b+","+a);
		}
	}
}
