//2. 定义一个6位数，求各个位置的数字和
package com.jnchen.week05;
import java.util.Scanner;

public class No2_TotalNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int n = in.nextInt();
		System.out.println(TotalNumber(n));
	}
	private static int TotalNumber( int a) {
		int sum = 0;
		int k;
		while(a!=0) {
			k = a % 10;
			a = a / 10;
			sum += k;
		}
		return sum;
	}
}
