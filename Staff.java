package com.jnchen.homework;

public class Staff extends Employee{
	public String chenghao;
	

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Staff(String chenghao) {
		this.chenghao = chenghao;
	}

	public String getChenghao() {
		return chenghao;
	}

	public void setChenghao(String chenghao) {
		this.chenghao = chenghao;
	}

	@Override
	public String toString() {
		return "Staff [chenghao=" + chenghao + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", office=" + office + ", salary=" + salary + ", date=" + date + ", name=" + name + ", sex="
				+ sex + ", age=" + age + "]";
	}
	
}
