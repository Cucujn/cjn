package com.cjn.week11;
//1、从键盘输入一个任意的字符串（如：aaabbababaaaababababa）
//统计该字符串中，长度为i的字串出现的次数（i从1开始到上述字符串长度结束）。
//提示：使用HashMap实现。
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
	//			String strs = str.substring(j, j+i);//在字符串中截取长度为i的子串
				++cnt;
				hs.put(i, cnt);
			}
		}
		Iterator<Integer> it = hs.keySet().iterator();
		while(it.hasNext()) {
			int k = it.next();
			System.out.println("长度为"+k+"的子串个数为："+hs.get(k));
		}
	}

}
