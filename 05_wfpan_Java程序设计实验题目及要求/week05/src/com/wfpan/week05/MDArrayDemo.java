package com.wfpan.week05;

public class MDArrayDemo {

	public static void main(String[] args) {
		// int a[3] -> int[3] a -> int[] a = new int[3]
		// int a[3][4] -> int[3][4] a -> int[][] a = new int[3][];
		
		int[][] a;
		
		
		a = new int[3][]; // int[] a[3];
		a[0] = new int[2];
		a[1] = new int[4];
		a[2] = new int[6];
		
//		a = new int[3][4];
//		*a -> a[0] //ÐÐÐÇßÖ
//		&a[0] -> a
/*		System.out.println(a.length);
		System.out.println(a[1].length);*/
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		
//		System.out.println(a[3][2]);
		
//		int[] b = null;
//		System.out.println(b[1]);
		
		
	}

}
