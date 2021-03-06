package com.jnchen.week09;

public class Triangle {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	private String color;
	private boolean filled;

	public Triangle(double side1,double side2,double side3,String color,boolean filled) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		this.color = color;
		this.filled = filled;
	}
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public double getPerimeter() {
		return (this.side1+this.side2+this.side3);
	}
	public double getArea() {
		double area;
		double p = this.getPerimeter();
		area = Math.sqrt(p*(p-this.side1)*(p-this.side2)*(p-this.side3));
		return area;
		
	}
	@Override
	public String toString() {
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	
}
