package com.jnchen.homework;

public class Employee extends Person{
	public String address;
	public String phoneNumber;
	public String email;
	public String office;
	public String salary;
	public String date;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String address,String phoneNumber,String email,String office,String salary,String date) {
		super();
		// TODO Auto-generated constructor stub
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.office = office;
		this.salary = salary;
		this.date = date;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Employee [address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", office="
				+ office + ", salary=" + salary + ", date=" + date + ", name=" + name + ", sex=" + sex + ", age=" + age
				+ "]";
	}
	
	
	

}
