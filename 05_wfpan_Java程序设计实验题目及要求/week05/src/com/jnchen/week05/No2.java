package com.jnchen.week05;

import java.util.Scanner;

public class No2 {
	public static int getSum(String num) {
		char[] array = num.toCharArray();
		int sum = 0;
		for (char c : array) {
			sum += c-'0';
		}
		/*int sum = 0;
		for(int i =0;i<num.length();i++) {
			sum += Integer.parseInt(num.substring(i, i+1));//���ַ���ת��Ϊ����
		}*/
		return sum;
	}
	public static void main(String[] args) {
		String num = null;
		Scanner in = new Scanner(System.in);
		num = in.nextLine();
		System.out.println(getSum(num));
	}
	
}
