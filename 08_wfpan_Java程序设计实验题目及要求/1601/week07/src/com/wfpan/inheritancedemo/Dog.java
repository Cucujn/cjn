package com.wfpan.inheritancedemo;

public class Dog extends Animal {
	//super�����࣬����
	private int salary;
	protected String sex = "nv"; //over write -> overwirte -> ��д������
	
	
	public Dog() {
		super(); //���ø�����޲ι��췽��
		String sex = super.sex;
		super.getAge();
	}
	/*public Dog() {
		getAge();
		setAge(19);
	}*/
	public Dog(String name, int age) {
	}
	void say() {
		System.out.println(super.to2String());
//		getAge();
//		System.out.println(sex);
	}
	
	/*��дҪ���������������ֵ������������������һ�£��������Ȩ��>=����Ȩ��*/
	@Override
	protected String to2String() {
		return "Dog [salary=" + salary + ", sex=" + sex + "]";
	}
	
	public static void main(String[] args) {
		Dog g = new Dog();
		g.say();
		
		System.out.println(g);
	}
}
