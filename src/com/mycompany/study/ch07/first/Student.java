package com.mycompany.study.ch07.first;

public class Student extends People{

	int studentNo;
	
	Student(String name, String ssn, int studentNo){
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	Student(String name, String ssn) {
		super(name, ssn);
	}
	
}
