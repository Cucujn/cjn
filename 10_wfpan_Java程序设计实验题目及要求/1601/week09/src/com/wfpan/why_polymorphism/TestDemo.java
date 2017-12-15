package com.wfpan.why_polymorphism;

// java TestDemo

/**
 * ʵ�ֶ�̬�ļ������裺
 * 1�����������������ࡢ���� =�� ����̳и���
 * 2�����������д�����е��Ǹ���������Ҫ���ֳ���̬���Ǹ�������
 * 3������Ķ��󸳸����������
 * 		���������ָ������Ķ��� =�� ���ϣ���=��Χ��ת��
 * 		С�Ŀ����Զ�ת�ɴ�ģ����תС��Ҫǿ������ת��
 * 		Aninmal �� dog ��dog תAnimal�����Զ�ת
 * 		Animal ת dog��ǿ��ת
 * 4��ͨ����������ã�����������д���Ǹ�����
 */


public class TestDemo {
	/*
	 * �������� -�� ��������̬
	 * */

	public static void main(String[] args) {
		/*cannot instantiate the type Animal
		 * ������ instantiate -> new 
		 * 1 -> 2*/
//		Animal anm = new Animal();
		
		//2 generalization -> extends
		//����������������̳е�
/*		Dog g = new Dog();
		g.eat();
		g.say();
		g.walk();
		*/	
		Animal anm = new Dog();
		anm.say(); //anm.say(this,super)
		//�������������ͣ�����ʱ�����ͣ�������ԣ����벻ͨ����������ʱ���ͣ���ָ��ʲô������ʲô��
		//anm �ı���ʱ���ͣ�Animal������ʱ������Dog��
		//��������������ǿ������ת��
		((Dog)anm).say(3);
		
		anm = new Cat();
		anm.say();
		
		
		//class cast = ���ת������ = ����ת
		//java.lang.ClassCast(ת��)Exception: com.wfpan.why_polymorphism.Cat cannot be cast to com.wfpan.why_polymorphism.Dog
//		((Dog)anm).say(3);
		
		if(anm instanceof Dog) {
			// A instance of B
			((Dog)anm).say(3);
		} 
		
		
	
	}

}
