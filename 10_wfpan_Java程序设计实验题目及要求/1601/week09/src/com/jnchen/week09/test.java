package com.jnchen.week09;

public class test {

	public static void main(String[] args) {
		Person person = new Person();
		Student stu = new Student();
		Employee employee = new Employee();
		Faculty fa = new Faculty();
		Staff staff = new Staff();
		person.setName("小明");
		person.setAddr("浙江工商大学");
		person.setAge(18);
		person.setEmail("123456@163.com");
		person.setPhoneNum("123456789");
		person.setSex("男");
		stu.getState1();
		employee.setOffice("浙江工商大学");
		employee.setSalary("10000");
		fa.setJibie("校长");
		fa.setWorkTime("8小时");
		staff.setChenghao("党员");
		staff.setDate("2017-8-15");
		System.out.println(person.toString());
		System.out.println(stu.toString());
		System.out.println(employee.toString());
		System.out.println(fa.toString());
		System.out.println(staff.toString());
	}

}
