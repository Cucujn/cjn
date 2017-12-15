package com.jnchen.week09;

public class SavingAccount extends Account{

	public SavingAccount(String number,double remains,double lilv,String date) {
		super();
		// TODO Auto-generated constructor stub
		this.remains = remains;
		this.number = number;
		this.lilv = lilv;
		this.date = date;
	}

	@Override
	public String toString() {
		return "SavingAccount [remains=" + remains + ", getNumber()=" + getNumber() + ", getRemains()=" + getRemains()
				+ ", getLilv()=" + getLilv() + ", getDate()=" + getDate() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
