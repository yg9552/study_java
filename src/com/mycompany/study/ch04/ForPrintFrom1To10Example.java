package com.mycompany.study.ch04;

import java.util.Iterator;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
	
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//			sum += i;	//sum = sum + i;
//		}
//		System.out.println("sum : " + sum);
		
//		1 부터 10 까지 더하는 프로그램 작성
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("sum: " + sum);
	}

}
