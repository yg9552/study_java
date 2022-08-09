package com.mycompany.study.ch04;

public class IfExample6 {

	public static void main(String[] args) {
		

//		int타입의 변수 3개를 선언하고
//		최소값 최대값을 구하는?
		
		int a = 1;
		int b = 3;
		int c = 8;
		
		if (a != b && a !=c && b != c) {
			if (a < b && a < c) {
			System.out.println("a는 최소값입니다");
			} else if (b < a && b < c){
			System.out.println("b는 최소값입니다");
			} else {
			System.out.println("c는 최소값입니다");
			}
			if (a > b && a > c) {
			System.out.println("a는 최대값입니다");
			} else if (b >a && b > c) {
			System.out.println("b는 최대값입니다");
			} else {
			System.out.println("c는 최대값입니다");
			}
		} else {
			System.out.println("a ,b, c 셋중 둘은 같습니다");
		}
	}
}
