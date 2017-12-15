package com.wfpan.week05;

import java.util.Arrays;

public class ArrayReAllocate {

	public static void main(String[] args) {
		int[] a = new int[]{3,4,5};
		
		
		/*int[] b = new int[a.length*3/2];
		for(int i = 0; i< a.length; i++) {
			b[i] = a[i];
		}
		b[a.length] = 4;
		
		a = b;
		
		for(int i = 0; i< a.length; i++) {
			System.out.println(a[i]);
		}*/
		
		//数组扩容：空间不够了，要扩大一下
		a = Arrays.copyOf(a, a.length*3/2);
		a[3] = 45;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
