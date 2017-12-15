package com.wfpan.week07;

public class EncapsulationDemo {
	String name;
	int age;
	
	void say() {
		Dog g = new Dog();
		int age = g.age;
		String sex = g.sex;
		int h = g.height;
		System.out.println("I am " + name);
	}
	
	public static void main(String[] args) {
		
	}

}


