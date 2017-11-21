package com.jnchen.homework;
import java.util.*;
public class Tese_Triangle extends Triangle{
	private String color;
	private boolean filled;
	public Tese_Triangle() {
		super();
	}
	
	private void setColr(String color) {
		this.color = color;
	}
	private String getColor() {
		return color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public static void main(String[] args) {
		Tese_Triangle a = new Tese_Triangle();
		Scanner in  = new Scanner(System.in);
		System.out.println("请输入side1:");
		double side1 = in.nextDouble();
		System.out.println("请输入side2:");
		double side2 = in.nextDouble();
		System.out.println("请输入side3:");
		double side3 = in.nextDouble();
 		System.out.println("请输入字符串color:");
 		String color = in.next();
		System.out.println("请输入布尔值filled 1或0");
		int b = in.nextInt();
		if(b==0) {
			a.setFilled(false);
		}
		if(b==1) {
			a.setFilled(true);
		}
		a.setSide1(side1);
		a.setSide2(side2);
		a.setSide3(side3);
		a.setColr(color);
		System.out.println(a.toString());
		System.out.println("三角形的面积："+a.getArea());
		System.out.println("周长："+a.getPerimeter());
		System.out.println("颜色"+a.getColor());
		System.out.println("是否填充"+a.isFilled());
		
	}

}
