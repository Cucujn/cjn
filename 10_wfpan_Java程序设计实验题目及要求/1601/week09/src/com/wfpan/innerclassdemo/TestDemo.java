package com.wfpan.innerclassdemo;

public class TestDemo {
	public static void main(String[] args) {
/*		//�Ǿ�̬�ڲ������Ǽ������ⲿ���е�
		//�ڲ���Ķ���ҲӦ�������ⲿ���е� -�� ���������ⲿ��Ķ��󣬲ſ������ڲ���Ķ���
		//����ͨ���ⲿ��Ķ���ȥ�����ڲ���Ķ��� c.new KeyBoard();
		Computer c = new Computer();
		//Computer$KeyBoard
//		Computer.KeyBoard kb = c.new KeyBoard();
		KeyBoard kb = c.new KeyBoard();*/
		
		//��̬���������
		Computer.KeyBoard kb = new Computer.KeyBoard();
		
		//     Dog extends Animal {}
		// new Dog               ();
		// new Animal() {}
		//gui ������
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
