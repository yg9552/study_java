package com.mycompany.study.ch07.second;

public class StudentExample {

	public static void main(String[] args) {

		Student student = new Student("양진용", "2010211359");
		System.out.println(student.name + " " + student.ssn + " " +student.studentNo);
		
		Student student2 = new Student("양진용", "2010-211-359", 17);
		System.out.println(student2.name + " " +student2.ssn + " " +student2.studentNo);
		
	}

}
