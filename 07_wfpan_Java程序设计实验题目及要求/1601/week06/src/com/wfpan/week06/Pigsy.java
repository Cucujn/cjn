package com.wfpan.week06;

public class Pigsy {
	//��Ա����
	String pigHead;
	String humanBody;
	String sex;
	String Jcdp;
	
	//��Ա����
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
		pig.pigHead = "��ͷ��";
		pig.humanBody = "����";
		pig.Jcdp = "�ʹ˶���";
		pig.sex = "��";
		pig.say("��ʦ��");
		pig.fly();
		pig.dating();
		
		Pigsy pig2 = new Pigsy();
		pig2.pigHead = "��ͷ��";
		System.out.println("---: " + (pig2.pigHead==pig.pigHead));
		
	}
	

}
