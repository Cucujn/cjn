package com.wfpan.why_polymorphism;

// java TestDemo

/**
 * 实现多态的几个步骤：
 * 1、有两个东西：父类、子类 =》 子类继承父类
 * 2、子类必须重写父类中的那个方法（你要表现出多态的那个方法）
 * 3、子类的对象赋给父类的引用
 * 		父类的引用指向子类的对象 =》 向上（大=范围大）转型
 * 		小的可以自动转成大的；大的转小的要强制类型转换
 * 		Aninmal 比 dog 大，dog 转Animal可以自动转
 * 		Animal 转 dog，强制转
 * 4、通过父类的引用，调用子类重写的那个方法
 */


public class TestDemo {
	/*
	 * 方法重载 -》 方法级多态
	 * */

	public static void main(String[] args) {
		/*cannot instantiate the type Animal
		 * 抽象类 instantiate -> new 
		 * 1 -> 2*/
//		Animal anm = new Animal();
		
		//2 generalization -> extends
		//抽象类就是用来被继承的
/*		Dog g = new Dog();
		g.eat();
		g.say();
		g.walk();
		*/	
		Animal anm = new Dog();
		anm.say(); //anm.say(this,super)
		//变量有两个类型：编译时的类型（如果不对，编译不通过）；运行时类型：（指向什么，就是什么）
		//anm 的编译时类型：Animal；运行时类型是Dog、
		//父类加这个方法、强制类型转换
		((Dog)anm).say(3);
		
		anm = new Cat();
		anm.say();
		
		
		//class cast = 类的转换错误 = 不能转
		//java.lang.ClassCast(转换)Exception: com.wfpan.why_polymorphism.Cat cannot be cast to com.wfpan.why_polymorphism.Dog
//		((Dog)anm).say(3);
		
		if(anm instanceof Dog) {
			// A instance of B
			((Dog)anm).say(3);
		} 
		
		
	
	}

}
