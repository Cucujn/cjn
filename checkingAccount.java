package com.jnchen.homework;

public class checkingAccount extends Account{
	public double touzhi;

	public checkingAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getTouzhi() {
		return touzhi;
	}

	public void setTouzhi(double touzhi) {
		this.touzhi = touzhi;
	}

	@Override
	public String toString() {
		return "checkingAccount [touzhi=" + touzhi + ", countNumber=" + countNumber + ", remain=" + remain
				+ ", nianlilv=" + nianlilv + ", date=" + date + "]";
	}
	
}
