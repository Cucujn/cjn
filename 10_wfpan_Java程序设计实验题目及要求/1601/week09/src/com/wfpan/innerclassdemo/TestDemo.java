package com.wfpan.innerclassdemo;

public class TestDemo {
	public static void main(String[] args) {
/*		//非静态内部类他是寄宿在外部类中的
		//内部类的对象，也应该是在外部类中的 -》 必须现有外部类的对象，才可以有内部类的对象
		//必须通过外部类的对象去构造内部类的对象 c.new KeyBoard();
		Computer c = new Computer();
		//Computer$KeyBoard
//		Computer.KeyBoard kb = c.new KeyBoard();
		KeyBoard kb = c.new KeyBoard();*/
		
		//静态的属于类的
		Computer.KeyBoard kb = new Computer.KeyBoard();
		
		//     Dog extends Animal {}
		// new Dog               ();
		// new Animal() {}
		//gui 监听器
		Animal ani = new Animal() {
			@Override
			public void say() {
			}

			@Override
			public void walk() {
			}

			@Override
			public void eat() {
			}
		};
		
		
		
		
	}
}
