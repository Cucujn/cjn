package com.jnchen.week09;

public class Account {
	protected String number;
	protected double remains;
	protected double lilv;
	protected String date;
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getRemains() {
		return remains;
	}
	public void setRemains(double remains) {
		this.remains = remains;
	}
	public double getLilv() {
		return lilv;
	}
	public void setLilv(double lilv) {
		this.lilv = lilv;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Account [number=" + number + ", remains=" + remains + ", lilv=" + lilv + ", date=" + date + "]";
	}
	public double cunkuan(double money) {
		this.remains += money;
		System.out.println("存入金额"+money+"元！");
		return this.remains;
	}
	public double qukuan(double money) {
		if(money>this.remains) {
			System.out.println("取款失败，余额不足！");
			return -1;
		} else {
			System.out.println("取入金额"+money+"元！");
			this.remains -= money;
			return this.remains;
		}
		
	}
}
