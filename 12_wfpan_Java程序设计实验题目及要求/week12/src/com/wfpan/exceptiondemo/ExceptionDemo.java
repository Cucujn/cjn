package com.wfpan.exceptiondemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import www.wfpan.stusort.Student;

public class ExceptionDemo {
	public static void main(String[] args) {
/*		int a = 0;
		// ArithmeticException
		if(a!=0) {
		int shang = 2/a;
		}
		//runtimeException 程序逻辑问题
		ArithmeticException ae = null;
		
		//IndexOutOfBoundsException
		int[] stu = new int[] {1,2,3,4};
		for(int i = 0; i<stu.length;i++) {
			if(stu[i]>stu[i+100] && i+100<stu.length) {
				
			}
		}*/
		//ClassCastException
	/*	Cat c = new Cat();
		if( c instanceof Dog) {
			Dog g = (Dog) c;
		}*/
		
		//NullPointerException
/*		Student stu2 = new Student();
		if(null!=stu2) {
			int ag = stu2.getAge();
		}*/
		
		
		//
	/*	try {
			FileInputStream fis = new FileInputStream("c://a.txt");
		} catch(Exception e) {
			//处理哦代码
		} finally {
			//统一出口
		}*/
		//finally catch至少出现一次
/*		try {
			//exception 受检异常 checked exception IO
			FileInputStream fis = new FileInputStream("c://a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		int d = Integer.parseInt(sc.nextLine());
		System.out.println(d);*/
		//java.lang.NumberFormatException
		//IOException, InterruptedException
		//RuntimeException
		//SQLException
/*		try {
			Thread.sleep(33);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		/*int a  = (Integer)(new Student());*/
		//cat -> (Dog)c -  
//		ClassCastException c = null;
		/*FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("c://a.txt"); //FileNotFoundException
			fis.read(); //IOException
			return 3;
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e.getStackTrace());
			System.out.println(e.getMessage());
			return 4;
		} catch (IOException e) {
//			e.printStackTrace();
			return 5;
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}*/
		
		// int float double boolean 
		// Integer Float Double Boolean
		//自动装箱子
		Integer i = 3;
		int j = i;
		
		Integer.parseInt("");
		
	}
}
