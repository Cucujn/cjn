package com.chenjn.week07;

import java.util.Scanner;

//����һ����ݼ��·ݣ��жϸ��µ�����

public class No1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] monthrun = {31,29,31,30,31,30,31,31,30,31,30,31};
		int[] month1 = {31,29,31,30,31,30,31,31,30,31,30,31};
		System.out.println("��������ݣ�");
		int year = in.nextInt();
		System.out.println("�������·ݣ�");
		int month = in.nextInt();
		int flag = runnian(year);
		if(flag==1) {
			System.out.println("����Ϊ��"+monthrun[month-1]);
		} else {
			System.out.println("����Ϊ��"+month1[month-1]);
		}
	}
	public static int runnian(int year) {
		if(year%4==0&&year%100!=0) {
			return 1;
		} else {
			return 0;
		}
	}
}
