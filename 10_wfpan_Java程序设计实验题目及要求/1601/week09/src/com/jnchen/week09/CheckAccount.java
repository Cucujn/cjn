package com.jnchen.week09;
//���֧Ʊ�˻�
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
			System.out.println("ȡ��ʧ�ܣ�����,����͸֧��");
			return -1;
		} else {
			System.out.println("ȡ����"+money+"Ԫ��");
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
