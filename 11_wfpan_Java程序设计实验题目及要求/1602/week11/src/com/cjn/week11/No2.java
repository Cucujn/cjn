package com.cjn.week11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class No2 {
	public static void main(String[] args) {
		ArrayList<String> stu = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		String name = null;
		for(int i = 0;i<10;i++) {
			name = in.nextLine();
			stu.add(name);
		}
		Collections.sort(stu);
		Iterator<String> it = stu.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
