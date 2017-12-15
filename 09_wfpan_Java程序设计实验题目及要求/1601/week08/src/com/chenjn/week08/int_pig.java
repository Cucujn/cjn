package com.chenjn.week08;

public class int_pig implements InpAnimal{
	private String name;
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
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int_pig(String name,int age,double weight) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "int_pig [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int_pig pig = new int_pig("pig", 9, 100);
		pig.say();
		pig.eat();
		System.out.println(pig.toString());

	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("I am pig!");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("I eat a lot!");
	}

}
