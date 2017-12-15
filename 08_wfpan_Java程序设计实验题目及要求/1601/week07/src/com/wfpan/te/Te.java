package com.wfpan.te;

import com.wfpan.week07.Dog;
 
/**
 *
 * private: 同类访问权限，只能在本类中的其它方法中直接使用
 * 不写：同包访问权限，可以被同包中的其它类访问（通过定义对象来访问）
 * protected：子类访问权限，可以被同包或不同包中的子类中的方法直接访问，或者定义对象来访问
 * public：通过对象来访问any where访问
 */
public class Te extends Dog{
	void say2() {
		//子类中可以访问
		System.out.println(sex);
	}
	public static void main(String[] args) {
		Te g = new Te();
		String sex = g.sex; //子类通过对象访问
		int h = g.height;
	}
}
