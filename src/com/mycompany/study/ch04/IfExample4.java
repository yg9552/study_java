package com.mycompany.study.ch04;

public class IfExample4 {

	public static void main(String[] args) {

//		int 타입의 변수를 2개 선언하고
//		두 정수가 주어졌을때 사분면의 어디에 해당하는지
		
		int x = 0;
		int y = 10;
		
		if (x < 0 && y > 0) {
			System.out.println("1사분면");
		} else if (x > 0 && y > 0){
			System.out.println("2사분면");
		} else if (x < 0 && y < 0) {
			System.out.println("3사분면");
		} else if (x > 0 && y < 0) {
			System.out.println("4사분면");
		} else if (x == 0) {
			System.out.println("x축 위에 있습니다");
		} else if (y == 0) {
			System.out.println("y축 위에 있습니다");
		}
		else {
			System.out.println("둘다0입니다");
		}
	}

}
