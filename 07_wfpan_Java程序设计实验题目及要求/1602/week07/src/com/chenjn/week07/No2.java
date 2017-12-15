package com.chenjn.week07;
//2. 输入一个年份及天数，判断它在一年中的第几周？
import java.util.Scanner;

public class No2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();
		int day = in.nextInt();
		//设置1970年一月一日为起始日，即周一
		int totalSum = 0;//1970-year的闰年总数
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
