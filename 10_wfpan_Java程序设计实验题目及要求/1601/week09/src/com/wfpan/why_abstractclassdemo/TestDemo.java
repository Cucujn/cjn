package com.wfpan.why_abstractclassdemo;

public class TestDemo {

	public static void main(String[] args) {
		/*cannot instantiate the type Animal
		 * 抽象类 instantiate -> new 
		 * 1 -> 2*/
//		Animal anm = new Animal();
		
		//2 generalization -> extends
		//抽象类就是用来被继承的
		Dog g = new Dog();
		g.eat();
		g.say();
		g.walk();
	}

}
