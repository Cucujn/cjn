package com.wfpan.innerclassdemo;

public class Computer {
	private String paiZi;
	private KeyBoard keyBoard;
	private CPU cpu;
	
	//这个类，只被外面这个类用，其它不会用到
	//内部类：跟属性和方法是类似的
	//static
	//not static 内部类，他是属于对象，外部类的对象，computer的的对象
	static class KeyBoard {
		private String color;
		private int keyCnt;
		public void say() {
		}
	}
	
	class CPU {
		private String brand;
		private float freq;
	}
}
