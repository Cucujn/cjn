package com.wfpan.week07;

/* encapsulation */
public class Pigsy {
	String name;
	int age;
	String sex;
	
	/*public default(��д) private protected*/
	//re-load: Pigsy() load twice,�ظ������룬����
	//���췽��������
	public Pigsy() {
		//singleton
	}
	
	public Pigsy(String name) {
		this.name = name;
	}
	
	public Pigsy(String name, int age) {
		//this��������� ����
		//��ǰ���ڳ�ʼ���Ķ���
		this(name); //��������ڹ��췽���ĵ�һ��
		this.age = age;
	}
	
	void eat() {
		//��ͨ�����У���ǰ���ڵ�������������Ǹ�����
		System.out.println(this.fly() + "I am eating.");
	}
	
	String fly() {
		return "I am flying.";
//		this();
	}
	
	void dating() {
		System.out.println("I have many gfs.");
	}
	
	public static void main(String[] args) {
		Pigsy pig = new Pigsy("����",18);
		pig.eat();
	}
}

class Monkey {
	String name;
	int age;
	void fly() {
		System.out.println("I have a jindouyun");
	}
}