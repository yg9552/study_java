package com.mycompany.study.ch04;

public class IfExample5 {

	public static void main(String[] args) {
		
//		int 변수 1개를 선언하고
//		짝수인지 홀수인지 확인
		
		int a = 0;
		
//		if (a%2 == 0) {
//			System.out.println("짝수입니다");
//		} else if (a%2 == 1) {
//			System.out.println("홀수입니다");
//		} else {
//			System.out.println("0입니다");
//		}
		
		if (a != 0) {
			if (a%2 == 0) {
				System.out.println("짝수입니다");
			} else if (a%2 == 1) {
				System.out.println("홀수입니다");
			}
		} else {
			System.out.println("0입니다");
		}
	}
}
