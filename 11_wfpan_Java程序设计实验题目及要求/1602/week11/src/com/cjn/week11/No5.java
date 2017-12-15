package com.cjn.week11;
//输入一组整数，统计每个整数出现的次数。提示：HashMap的使用
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
			System.out.println(k+"出现的次数为"+hs.get(k));
		}
	}
}
