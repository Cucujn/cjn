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
		System.out.println("������Ҫ����Ľ��");
		double money = in.nextDouble();
		remain = money+remain;
		System.out.println("�������Ϊ"+remain);
	}
	public void qukuan() {
		Scanner in = new Scanner(System.in);
		System.out.println("������Ҫȡ��Ľ��");
		double money = in.nextDouble();
		if(money>remain) {
			System.out.println("�����������������");
			money = in.nextDouble();
		}
		remain = remain - money;
		System.out.println("�������Ϊ"+remain);
	}
	@Override
	public String toString() {
		return "Account [countNumber=" + countNumber + ", remain=" + remain + ", nianlilv=" + nianlilv + ", date="
				+ date + ", getCountNumber()=" + getCountNumber() + ", getRemain()=" + getRemain() + ", getNianlilv()="
				+ getNianlilv() + ", getDate()=" + getDate() + "]";
	}
	


	
}
