package com.mycompany.study.ch04;

public class IfExample2 {

	public static void main(String[] args) {
		
//		일반 : 1, 5% 할인적용 5/100
//		브론즈 : 2, 10% 할인적용 10/100
//		실버 : 3, 15% 할인적용 15/100
//		골드 : 4, 20% 할인적용 20/100
//		플레티넘 : 5, 2.7% 할인적용 27/1000
		
		int grade = 6;
		int cost = 10000;
		
		if (grade == 1) {
			System.out.println("정가가" + cost + "원인 일반 등급의 할인가는" + (int)cost * (1-0.05) + "원 입니다");
		} else if (grade == 2) {
			System.out.println("정가가" + cost + "원인 브론즈 등급의 할인가는" + (int)cost * (1-0.1) + "원 입니다");
		} else if (grade == 3) {
			System.out.println("정가가" + cost + "원인 실버 등급의 할인가는" + (int)cost * (1-0.15) + "원 입니다");
		} else if (grade == 4 ) {
			System.out.println("정가가" + cost + "원인 골드 등급의 할인가는" + (int)cost * (1-0.2) + "원 입니다");
		} else if (grade ==5) {
			System.out.println("정가가" + cost + "원인 플레티넘 등급의 할인가는" + (int) cost * (1-0.027) + "원 입니다");
		} else {
			System.out.println("비회원의 가격은 " + cost + "원 입니다");
		}
		
	}

}
