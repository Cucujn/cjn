package com.chenjn.week08;

public class absDog extends absAnimal{
	
	

	public absDog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public absDog(String name,int age,double weigh) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weigh;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		absDog dog = new absDog("dog",5,6.0);
		dog.eat();
		dog.say();
		System.out.println(dog.toString());

	}

	@Override
	public void eat() {
		System.out.println("I eat meat!");
	}
	public void say() {
		System.out.println("I am dog!");
	}
	@Override
	public String toString() {
		return "absDog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
	}

}
