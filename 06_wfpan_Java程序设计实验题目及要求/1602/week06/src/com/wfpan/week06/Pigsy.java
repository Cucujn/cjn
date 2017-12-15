package com.wfpan.week06;

public class Pigsy {
	//成员属性
	String pigHead;
	String humanBody;
	String sex;
	String Jcdp;
	
	//成员方法
	void say(String content) {
		System.out.println("I can say " + content);
	}
	void fly() {
		System.out.println("I can fly.");
	}
	
	void dating() {
		System.out.println("I have many girl friends.");
	}
	
	public static void main(String[] args) {
		Pigsy pig = null;
//		pig.say(); //NullPointerException
		pig = new Pigsy();
		pig.pigHead = "猪头三";
		pig.humanBody = "猪身";
		pig.Jcdp = "就此钉耙";
		pig.sex = "男";
		pig.say("二师兄");
		pig.fly();
		pig.dating();
		
		Pigsy pig2 = new Pigsy();
		pig2.pigHead = "猪头三";
		System.out.println("---: " + (pig2.pigHead==pig.pigHead));
		
	}
	

}
