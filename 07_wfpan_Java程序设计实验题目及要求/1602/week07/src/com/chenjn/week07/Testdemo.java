package com.chenjn.week07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Testdemo {
	public static void main(String[] args) {
		ArrayList<Float> score1 = new ArrayList<Float>();
		score1.add(66.6f);
		score1.add(66.6f);
		score1.add(66.6f);
		score1.add(66.6f);
		score1.add(66.6f);
		score1.add(66.6f);
		ArrayList<Float> score2 = new ArrayList<Float>();
		score2.add(80.6f);
		score2.add(98.6f);
		score2.add(68.6f);
		score2.add(70.6f);
		score2.add(66.6f);
		score2.add(70f);
		Student stu1 = new Student("小红",18, "女", score1);
		Student stu2 = new Student("小英",18, "女", score2);
		ArrayList<Student> stus = new ArrayList<Student>();
		stus.add(stu1);
		stus.add(stu2);
		ClassDemo cls1 = new ClassDemo("软件1班", stus);
		Collections.sort(cls1.getStu());
		Iterator<Student> it = cls1.getStu().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
}
}
