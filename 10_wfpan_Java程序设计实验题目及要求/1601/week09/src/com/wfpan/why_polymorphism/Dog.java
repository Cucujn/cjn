package com.wfpan.why_polymorphism;

public class Dog extends Animal {
	//override = overwrite
	@Override
	public void say() {
		System.out.println("wang wang...");
	}
	//ÐÂ·½·¨
	public void say(int a) {
		System.out.println("wang 3wang...");
	}

	@Override
	public void walk() {
		System.out.println("sige tui...");
	}

	@Override
	public void eat() {
		System.out.println("tete");
	}
}
