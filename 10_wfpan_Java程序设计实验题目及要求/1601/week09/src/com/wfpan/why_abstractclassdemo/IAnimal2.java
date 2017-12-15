package com.wfpan.why_abstractclassdemo;
public interface IAnimal2 {
	// interface: 常量 + 抽象方法
	// 属性都是：public static final
	// final(常量) -> public static
	/*public static final */float PI = 3.1415926f;
	
	//方法都是 public abstract
	/*public abstract*/ void say();
	/*public abstract*/ void walk();
	/*public abstract*/ void eat();
}
