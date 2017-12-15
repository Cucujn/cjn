package com.chenjn.week08;

public class cat_class extends Animal_class{
	public void say() {
		System.out.println("I am cat!");
	}
	public void eat() {
		System.out.println("I eat fish!");
	}
	

	public cat_class() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		cat_class cat = new cat_class();
		cat.setAge(8);
		cat.setName("cat");
		cat.setWeight(5.66);
		cat.eat();
		cat.say();
		System.out.println(cat.toString());
	}

}
