package com.chenjn.week07;
//2. ����һ����ݼ��������ж�����һ���еĵڼ��ܣ�
import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int day = in.nextInt();
		//����1970��һ��һ��Ϊ��ʼ�գ�����һ
		int totalSum = 0;//1970-year����������
		for(int i = 1970;i<=year;i++) {
			if(runnian(i)==1) {
				totalSum++;
			}
		}
		int day1 = (year-1970-totalSum-1)*365+totalSum*366+day;
		int day2 = (year-1970-totalSum-1)*365+totalSum*366;
		int week = day1/7-day2/7;
		System.out.println(week);
	}
	public static int runnian(int year) {
		if(year%4==0&&year%100!=0) {
			return 1;
		} else {
			return 0;
		}
	}

}
