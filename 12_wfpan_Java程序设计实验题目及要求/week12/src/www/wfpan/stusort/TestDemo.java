package www.wfpan.stusort;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		final int STUNUM = 3;//学生的数量
		ArrayList<Student> stuList = new ArrayList<Student>();//数组大小可变的容器
		Scanner sc = new Scanner(System.in);
		int i = 0;
		System.out.println("ex: xx 12 nv");
		
		Student stu = null;
		while(i<STUNUM) {
			stu = new Student();
			System.out.println(i+1+":");
			String stuInfo = sc.nextLine();//输入学生信息
			String[] infoArr = stuInfo.split(" ");//将学生信息放入数组infoArr中
			stu.setName(infoArr[0]);
			stu.setAge(Integer.parseInt(infoArr[1]));
			stu.setSex(infoArr[2]);//设置stu[i]的姓名、年龄、性别
			stuList.add(stu);//将stu[i]加入到容器中
			i++;
		}
		sc.close();
		
		ClassDemo cls = new ClassDemo("软件16级", stuList);
		
		Collections.sort(cls.getStuList(), new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge()-o2.getAge()>0?1:(o1.getAge()-o2.getAge()==0?0:-1);//将stuList以年龄为基准，升序排序，o1.age>o2.age返回1，
				//相等返回0，小于返回-1；
			}
		});
		
		System.out.println(cls);
		
		
		/*Student[] stuTmp = new Student[stuList.size()];
		for(i = 0; i < stuList.size();i++){
			stuTmp[i] = stuList.get(i);
		}
		
		System.out.println(Arrays.toString(stuTmp));
		
		Arrays.sort(stuTmp,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		
		System.out.println(Arrays.toString(stuTmp));
		
		System.out.println(cls);*/
		
	}

}
