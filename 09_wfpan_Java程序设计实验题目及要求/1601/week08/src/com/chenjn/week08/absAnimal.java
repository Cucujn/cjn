package com.chenjn.week08;

public abstract class absAnimal {
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
	abstract public void say();
	abstract public void eat();
}
