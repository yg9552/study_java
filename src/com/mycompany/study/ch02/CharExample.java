package com.mycompany.study.ch02;

public class CharExample {

	public static void main(String[] args) {

//		자바는 모든 문자를 유니코드로 처리함
//		국제 표준 규약
		char c1 = 'A';	//문자를 저장
		char c2 = 65;	//십진수로 저장
		char c3 = '\u0041';	//16진수로 저장
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		
	}

}
