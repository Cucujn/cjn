package com.wfpan.inheritancedemo;

public class Dog extends Animal {
	//super：超类，父类
	private int salary;
	protected String sex = "nv"; //over write -> overwirte -> 重写、覆盖
	
	
	public Dog() {
		super(); //调用父类的无参构造方法
		String sex = super.sex;
		super.getAge();
	}
	/*public Dog() {
		getAge();
		setAge(19);
	}*/
	public Dog(String name, int age) {
	}
	void say() {
		System.out.println(super.to2String());
//		getAge();
//		System.out.println(sex);
	}
	
	/*重写要满足的条件：返回值、函数名、参数都得一致，子类访问权限>=父类权限*/
	@Override
	protected String to2String() {
		return "Dog [salary=" + salary + ", sex=" + sex + "]";
	}
	
	public static void main(String[] args) {
		Dog g = new Dog();
		g.say();
		
		System.out.println(g);
	}
}
