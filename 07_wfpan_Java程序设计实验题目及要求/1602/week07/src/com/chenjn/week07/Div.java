package com.chenjn.week07;

public class Div {

	public void Divided(int a ,int b) throws DivBException {
		// TODO Auto-generated constructor stub
		if(0!=b) {
			System.out.println(a/b);
		} else {
			throw new DivBException("³ý0");
		}
	}

	public static void main(String[] args) {
		
			try {
				new Div().Divided(3, 0);
			} catch (DivBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
