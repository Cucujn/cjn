package com.wfpan.week05;

public class BreakDemo {

	public static void main(String[] args) {
		//break�˳���ǰ��break���ڵ��Ǹ������for��ѭ��
		for(int i=1;i<101;i++) {
//			50>>011
			System.out.println(i + "--" + Integer.toBinaryString(50>>i));
		}
		
		//������Χ��int 21��, 2^100
		/*int i=0, j=0;
		for(i = 0; i < 5;i++) {
			for(j = 0; j < 10; j++) {
				if(5==j) {
//					break;
					continue;
				}
				//
			}
			System.out.println(j +"-"+" I am here.");
		}
		System.out.println(j +"-"+" you are here.");*/
	}
}
