package com.mycompany.study.ch07.forth;

public class Computer extends Calculator {

	@Override
	public double circle(double r) {
		System.out.println("Computer객체의 원면적 구하는 프로그램 실행");
		return Constants.PAI_2 * r * r ;
	}

	
}
