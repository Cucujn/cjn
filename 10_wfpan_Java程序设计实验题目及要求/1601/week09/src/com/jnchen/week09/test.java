package com.jnchen.week09;

public class test {

	public static void main(String[] args) {
		Person person = new Person();
		Student stu = new Student();
		Employee employee = new Employee();
		Faculty fa = new Faculty();
		Staff staff = new Staff();
		person.setName("С��");
		person.setAddr("�㽭���̴�ѧ");
		person.setAge(18);
		person.setEmail("123456@163.com");
		person.setPhoneNum("123456789");
		person.setSex("��");
		stu.getState1();
		employee.setOffice("�㽭���̴�ѧ");
		employee.setSalary("10000");
		fa.setJibie("У��");
		fa.setWorkTime("8Сʱ");
		staff.setChenghao("��Ա");
		staff.setDate("2017-8-15");
		System.out.println(person.toString());
		System.out.println(stu.toString());
		System.out.println(employee.toString());
		System.out.println(fa.toString());
		System.out.println(staff.toString());
	}

}
