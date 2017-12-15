package com.wfpan.week05;

public class SwitchDemo {

	public static void main(String[] args) {
		// char byte short int > jdk1.7/1.8 "aaa"
		switch ("1") {
			case "1":
				System.out.println("llll");
			
			case "3": 
			case "2":
			default:
				System.out.println("default");

		}
	}

}
