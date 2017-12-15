package com.cjn.week12;

public class Div {
	public static void div(float a, float b) throws DivException{
		if(b!=0) {
			System.out.println(a/b);
		} else {
			throw new DivException("³ý0");
		}
	}
	public static void main(String[] args) {
		float a = 5.0f;
		float b = 0.0f;
		try {
			div(a, b);
		} catch (DivException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
