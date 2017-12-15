package com.wfpan.week05;


/**
 * @author lenovo
 *
 */
public class AddDemo {
	public static void main(String[] args) {
		//方法重载 re - load -> 同样的方法名
		add(3.0f,2);
		
		boolean[][] bo = null;
		bo = new boolean[2][];
		bo[0] = new boolean[2];
		
	}
	
	public static int add(int a, int b) {
		return 0;
	}
	
	public static float add(float a, float b) {
		return 0;
	}
	public static float add(int a, float b) {
		return 0;
	}
	public static float add(float a, int b) {
		return 0;
	}
	/*public static float add(float b, int c) {
		return 0;
	}*/
	//int a(int, int); //c语言中
	
	/*public static int add(float a, int b) {
		return 0;
	}*/
	
	
}
