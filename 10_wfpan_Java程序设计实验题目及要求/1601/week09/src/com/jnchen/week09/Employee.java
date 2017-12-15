package com.jnchen.week09;

public class Employee extends Person{
	private String Office;
	private String Salary;
	private String Date;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getOffice() {
		return Office;
	}
	public void setOffice(String office) {
		Office = office;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	@Override
	public String toString() {
		return "Employee [Office=" + Office + ", Salary=" + Salary + ", Date=" + Date + "]";
	}
	
}
