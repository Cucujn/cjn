package com.wfpan.week07;

/* encapsulation */
public class Pigsy {
	String name;
	int age;
	String sex;
	
	/*public default(不写) private protected*/
	//re-load: Pigsy() load twice,重复的载入，重载
	//构造方法的重载
	public Pigsy() {
		//singleton
	}
	
	public Pigsy(String name) {
		this.name = name;
	}
	
	public Pigsy(String name, int age) {
		//this：这个东西 对象
		//当前正在初始化的对象
		this(name); //必须出现在构造方法的第一行
		this.age = age;
	}
	
	void eat() {
		//普通方法中：当前正在调用这个方法的那个对象
		System.out.println(this.fly() + "I am eating.");
	}
	
	String fly() {
		return "I am flying.";
//		this();
	}
	
	void dating() {
		System.out.println("I have many gfs.");
	}
	
	public static void main(String[] args) {
		Pigsy pig = new Pigsy("天篷",18);
		pig.eat();
	}
}

class Monkey {
	String name;
	int age;
	void fly() {
		System.out.println("I have a jindouyun");
	}
}