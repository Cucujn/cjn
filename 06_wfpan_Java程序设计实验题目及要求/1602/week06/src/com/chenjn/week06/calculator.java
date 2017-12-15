package com.chenjn.week06;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("输入1 ，这里用1代表进行两个int数据的除法,输入2，表示进行两个float的除法");
		int n = in.nextInt();
		switch (n) {
		case 1:
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(add(a,b));
			break;
		case 2:
			float c = in.nextFloat();
			float d = in.nextFloat();
			System.out.println(add(c,d));
		default:
			double e =in.nextDouble();
			double f = in.nextDouble();
			System.out.println(add(e,f));
			break;
		}

	}
	public static  double add(int a,int b) {
		return (double)a/b;
	}
	public static float add(float a  ,float b) {
		return a/b;
	}
	public static double add(double a,double b) {
		return a/b;
	}

}
