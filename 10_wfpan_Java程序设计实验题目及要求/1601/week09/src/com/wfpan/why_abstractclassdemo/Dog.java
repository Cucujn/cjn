package com.wfpan.why_abstractclassdemo;

public class Dog extends Animal {
	//override = overwrite
	@Override
	public void say() {
		System.out.println("wang wang...");
	}
	//�·���
	public void say(int a) {
		System.out.println("wang wang...");
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
