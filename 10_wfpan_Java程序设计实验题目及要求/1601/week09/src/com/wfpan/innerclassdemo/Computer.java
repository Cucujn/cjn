package com.wfpan.innerclassdemo;

public class Computer {
	private String paiZi;
	private KeyBoard keyBoard;
	private CPU cpu;
	
	//����ֻ࣬������������ã����������õ�
	//�ڲ��ࣺ�����Ժͷ��������Ƶ�
	//static
	//not static �ڲ��࣬�������ڶ����ⲿ��Ķ���computer�ĵĶ���
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
