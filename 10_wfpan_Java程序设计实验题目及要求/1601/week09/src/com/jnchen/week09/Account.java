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
		System.out.println("������"+money+"Ԫ��");
		return this.remains;
	}
	public double qukuan(double money) {
		if(money>this.remains) {
			System.out.println("ȡ��ʧ�ܣ����㣡");
			return -1;
		} else {
			System.out.println("ȡ����"+money+"Ԫ��");
			this.remains -= money;
			return this.remains;
		}
		
	}
}
