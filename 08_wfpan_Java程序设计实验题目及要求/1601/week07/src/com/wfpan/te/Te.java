package com.wfpan.te;

import com.wfpan.week07.Dog;
 
/**
 *
 * private: ͬ�����Ȩ�ޣ�ֻ���ڱ����е�����������ֱ��ʹ��
 * ��д��ͬ������Ȩ�ޣ����Ա�ͬ���е���������ʣ�ͨ��������������ʣ�
 * protected���������Ȩ�ޣ����Ա�ͬ����ͬ���е������еķ���ֱ�ӷ��ʣ����߶������������
 * public��ͨ������������any where����
 */
public class Te extends Dog{
	void say2() {
		//�����п��Է���
		System.out.println(sex);
	}
	public static void main(String[] args) {
		Te g = new Te();
		String sex = g.sex; //����ͨ���������
		int h = g.height;
	}
}
