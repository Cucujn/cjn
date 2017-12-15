package com.wfpan.why_abstractclassdemo;
//编程：面向接口的编程，你能用接口做的东西，就不要用类
public abstract class Animal implements IAnimal,IAnimal2{
	protected String name;
	protected int age;
	protected String sex;
	public static final float PI = 3.1415926f;
	
	public Animal() {
		super();
	}
	public Animal(String name, int age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	/* 父类里面搞不清楚怎么定义，或者不想定义
	 * 只有方法头，没有方法体
	 * 方法声明-》抽象类*/
	public abstract void say();
	public abstract void walk();
	public abstract void eat();
	
	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
}
