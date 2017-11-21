package com.jnchen.homework;
import java.util.*;
public class Account {
	public String countNumber;
	public double remain;
	public double nianlilv;
	public String date;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCountNumber() {
		return countNumber;
	}
	public void setCountNumber(String countNumber) {
		this.countNumber = countNumber;
	}
	public double getRemain() {
		return remain;
	}
	public void setRemain(int remain) {
		this.remain = remain;
	}
	public double getNianlilv() {
		return nianlilv;
	}
	public void setNianlilv(double string) {
		this.nianlilv = string;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public void cunkuan() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要存入的金额");
		double money = in.nextDouble();
		remain = money+remain;
		System.out.println("您的余额为"+remain);
	}
	public void qukuan() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入要取入的金额");
		double money = in.nextDouble();
		if(money>remain) {
			System.out.println("输入错误，请重新输入");
			money = in.nextDouble();
		}
		remain = remain - money;
		System.out.println("您的余额为"+remain);
	}
	@Override
	public String toString() {
		return "Account [countNumber=" + countNumber + ", remain=" + remain + ", nianlilv=" + nianlilv + ", date="
				+ date + ", getCountNumber()=" + getCountNumber() + ", getRemain()=" + getRemain() + ", getNianlilv()="
				+ getNianlilv() + ", getDate()=" + getDate() + "]";
	}
	


	
}
