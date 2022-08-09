package com.mycompany.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		

//		int타입의 변수 3개를 선언하고
//		최소값 최대값을 구하는?
		
		int a = 6;
		int b = 23;
		int c = 3;
		
		if (a < b & a < c) {
			System.out.println("a는 최소값입니다");
		} else if (b < a & b < c){
			System.out.println("b는 최소값입니다");
		} else {
			System.out.println("c는 최소값입니다");
		}
		if (a > b & a > c) {
			System.out.println("a는 최대값입니다");
		} else if (b >a & b > c) {
			System.out.println("b는 최대값입니다");
		} else {
			System.out.println("c는 최대값입니다");
		}
		
	}
}
