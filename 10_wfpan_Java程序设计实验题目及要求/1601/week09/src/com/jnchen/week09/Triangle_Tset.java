package com.jnchen.week09;

public class Triangle_Tset {
	public static void main(String[] args) {
		Triangle tr = new Triangle(3.0,4.0,5.0,"red",true);
		double area = tr.getArea();
		double pr = tr.getPerimeter();
		String color = tr.getColor();
		boolean filled = tr.isFilled();
		System.out.println(tr.toString());
		System.out.println("�����ε������"+area+"\t�����ε��ܳ�Ϊ��"+pr);
		System.out.println("�����ε���ɫ��"+color+"\t�������Ƿ���䣺"+filled);
	}
}
