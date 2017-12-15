package com.chenjn.week08;

public class Animal_class {
	protected String name;
	protected int age;
	protected double weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "Animal_class [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	public void setWeight(double d) {
		this.weight = d;
	}
	public void say() {
		System.out.println("I am animal");
	}
	public void eat() {
		System.out.println("I can eat something!");
	}
}
