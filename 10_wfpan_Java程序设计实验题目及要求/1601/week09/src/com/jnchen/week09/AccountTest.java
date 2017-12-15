package com.jnchen.week09;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckAccount ck = new CheckAccount("10000",22222.3,0.01,"2017-3-25",1000.0);
		SavingAccount sa = new SavingAccount("11111",2222.3,0.01,"2017-3-25");
		ck.cunkuan(100);
		ck.qukuan(10001);
		sa.qukuan(100);
		sa.cunkuan(100);
	}

}
