package com.cjn.week12;

import java.util.Scanner;

public class No1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		String str = null;
		for(int i = 0; i < 10; i++) {
			 str = in.nextLine();
			 sb.append(str);
		}
		System.out.println(sb);
	}

}
