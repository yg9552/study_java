package com.mycompany.study.ch09.second;

public class ThrowsExample {
	//throws ClassNotFoundException
	public static void findClass() throws ClassNotFoundException  {
		Class clazz = Class.forName("java.lang.String2");
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
