package com.jnchen.week09;
//检测支票账户
public class CheckAccount extends Account{
	private double touzhi;

	public CheckAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CheckAccount(String number,double remains,double lilv,String date,double touzhi) {
		super();
		// TODO Auto-generated constructor stub
		this.remains = remains;
		this.number = number;
		this.lilv = lilv;
		this.date = date;
		this.touzhi = touzhi;
	}

	public double getTouzhi() {
		return touzhi;
	}

	public void setTouzhi(double touzhi) {
		this.touzhi = touzhi;
	}
	public double qukuan(double money) {
		if(money>(this.remains+touzhi)) {
			System.out.println("取款失败，余额不足,超过透支金额！");
			return -1;
		} else {
			System.out.println("取入金额"+money+"元！");
			if(money<=this.remains){
				this.remains -= money;
				return this.remains;
			} else {
				this.touzhi = this.touzhi-money+remains;
				this.remains = 0;
				return touzhi;
			}
		}
}
}
