package com.mycompany.study.ch04;

public class IfExample3 {

	public static void main(String[] args) {
		
//		int 타입의 변수를 2개 선언하고
//		두 정수가 주어졌을때 두 정수를 비교하여
//		크기 비교 결과를 나타내는 프로그램을 작성
		
		int a = 1, b = 1;
		
		if (a == b) {
			System.out.println("a와 b가 같다");
		} else if (a>b) {
			System.out.println("a가 b보다 크다");
		} else if (a<b) {
			System.out.println("a가 b보다 작다");
		} else {
			System.out.println("안나옴");
		}
	}

}
