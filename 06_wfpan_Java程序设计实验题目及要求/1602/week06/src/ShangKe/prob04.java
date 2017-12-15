package ShangKe;

import java.util.ArrayList;
import java.util.Arrays;

public class prob04 {
	public static void main(String[] args) {
		Student[] stus = new Student[2];
		ArrayList<Float> scorelist1 = new ArrayList<Float>();
		scorelist1.add(68.0f);
		scorelist1.add(86.0f);
		scorelist1.add(68.0f);
		scorelist1.add(86.0f);
		scorelist1.add(68.0f);
		scorelist1.add(86.0f);
		Student stu1 = new Student("zs1",18,"ÄÐ",scorelist1);
		ArrayList<Float> scorelist2 = new ArrayList<Float>();
		scorelist2.add(68.0f);
		scorelist2.add(86.0f);
		scorelist2.add(68.0f);
		scorelist2.add(86.0f);
		scorelist2.add(68.0f);
		scorelist2.add(86.0f);
		Student stu2 = new Student("zs2",18,"ÄÐ",scorelist2);
		ArrayList<Student> Stus = new ArrayList<Student>();
		Stus.add(stu1);
		Stus.add(stu2);
		ClassRoom cls = new ClassRoom("Èí¼þ1°à",Stus);
		ArrayList<Float> ave = new ArrayList<Float>();
		int sum = 0;
		for (int i = 0; i < stus.length; i++) {
			for(int j = 0; j < 6;j++) {
				sum = 0;

			}
		}
	}
}
