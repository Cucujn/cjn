package com.jnchen.week09;

public class Triangle_Tset {
	public static void main(String[] args) {
		Triangle tr = new Triangle(3.0,4.0,5.0,"red",true);
		double area = tr.getArea();
		double pr = tr.getPerimeter();
		String color = tr.getColor();
		boolean filled = tr.isFilled();
		System.out.println(tr.toString());
		System.out.println("三角形的面积："+area+"\t三角形的周长为："+pr);
		System.out.println("三角形的颜色："+color+"\t三角形是否填充："+filled);
	}
}
