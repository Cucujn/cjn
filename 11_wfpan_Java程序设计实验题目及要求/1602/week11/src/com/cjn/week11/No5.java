package com.cjn.week11;
//����һ��������ͳ��ÿ���������ֵĴ�������ʾ��HashMap��ʹ��
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class No5 {
	public static void main(String[] args) {
		String num = null;
		Scanner in = new Scanner(System.in);
		num = in.nextLine();
		HashMap<Character, Integer> hs = new HashMap<>();
		char[] s = num.toCharArray();
		int cnt = 0;
		for(int i = 0;i<s.length;i++) {
			
			if(hs.containsKey(s[i])) {
				 cnt = hs.get(s[i])+1;
				hs.put(s[i], cnt);
			} else {
				hs.put(s[i], 1);
			}
		}
		Iterator<Character> it = hs.keySet().iterator();
		while(it.hasNext()) {
			Character k = it.next();
			System.out.println(k+"���ֵĴ���Ϊ"+hs.get(k));
		}
	}
}
