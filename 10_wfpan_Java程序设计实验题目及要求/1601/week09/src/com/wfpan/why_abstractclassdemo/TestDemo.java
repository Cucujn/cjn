package com.wfpan.why_abstractclassdemo;

public class TestDemo {

	public static void main(String[] args) {
		/*cannot instantiate the type Animal
		 * ������ instantiate -> new 
		 * 1 -> 2*/
//		Animal anm = new Animal();
		
		//2 generalization -> extends
		//����������������̳е�
		Dog g = new Dog();
		g.eat();
		g.say();
		g.walk();
	}

}
