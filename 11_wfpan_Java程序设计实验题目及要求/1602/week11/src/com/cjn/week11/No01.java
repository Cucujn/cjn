package com.cjn.week11;
//1���Ӽ�������һ��������ַ������磺aaabbababaaaababababa��
//ͳ�Ƹ��ַ����У�����Ϊi���ִ����ֵĴ�����i��1��ʼ�������ַ������Ƚ�������
//��ʾ��ʹ��HashMapʵ�֡�
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class No01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		//aaabbababaaaababababa
		HashMap<Integer, Integer> hs = new HashMap<>();
		int cnt = 0;
		for(int i = 1;i<=str.length(); i++) {
			cnt = 0;
			for(int j = 1;j<=str.length()-i+1;j++) {//aaaaaa 3
	//			String strs = str.substring(j, j+i);//���ַ����н�ȡ����Ϊi���Ӵ�
				++cnt;
				hs.put(i, cnt);
			}
		}
		Iterator<Integer> it = hs.keySet().iterator();
		while(it.hasNext()) {
			int k = it.next();
			System.out.println("����Ϊ"+k+"���Ӵ�����Ϊ��"+hs.get(k));
		}
	}

}
