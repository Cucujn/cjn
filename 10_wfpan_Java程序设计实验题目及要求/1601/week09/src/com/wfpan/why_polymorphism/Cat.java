package com.wfpan.why_polymorphism;

public class Cat extends Animal{

	@Override
	public void say() {
		System.out.println("miao miao...");
	}

	@Override
	public void walk() {
		System.out.println("cat walk...");
	}

	@Override
	public void eat() {
		System.out.println("I like fish...");
	}

}
