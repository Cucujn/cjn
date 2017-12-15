package com.jnchen.week09;

public class Staff extends Employee{
	private String chenghao;

	public Staff() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getChenghao() {
		return chenghao;
	}

	public void setChenghao(String chenghao) {
		this.chenghao = chenghao;
	}

	@Override
	public String toString() {
		return "Staff [chenghao=" + chenghao + "]";
	}
	
}
