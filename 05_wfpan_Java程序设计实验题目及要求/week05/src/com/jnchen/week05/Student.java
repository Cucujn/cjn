package com.jnchen.week05;

public class Student {
	public static void main(String[] args) {
		float[][] stu = new float[5][6];

		//����ѧ���ĳɼ�
		for(int i = 0;i<5;i++) {
//			System.out.println("�������"+i+"��ѧ���ĳɼ�");
			for(int j = 0;j<6;j++) {
				stu[i][j] = 1+(float)(Math.random()*99);
			}
		}
		for(int i = 0;i<5;i++) {
			System.out.println("��"+(i+1)+"��ѧ���ĳɼ�");
			for(int j = 0;j<6;j++) {
				System.out.print(stu[i][j]+"   ");
			}
			System.out.print("\n");
		}
		float max, min;
		int m=0,n=0;
		for(int i=0;i<6;i++) {
			max = 0;
			min = 1000;
			for(int j=0;j<5;j++) {
				if(stu[j][i]>=max) {
					max = stu[j][i];
					m = j;
				}
				if(stu[j][i]<=min) {
					min = stu[j][i];
					n = j;
				}
			}
			System.out.println("��"+(i+1)+"�ſεģ�");
			System.out.println("���ɼ�Ϊ"+max+"ѧ�����Ϊ"+(m+1));
			System.out.println("��С�ɼ�Ϊ"+min+"ѧ�����Ϊ"+(n+1));
		}
		
	}
}
