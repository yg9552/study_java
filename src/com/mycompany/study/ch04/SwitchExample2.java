package com.mycompany.study.ch04;

public class SwitchExample2 {

	public static void main(String[] args) {
		
//		일반 : 1, 5% 할인적용 5/100
//		브론즈 : 2, 10% 할인적용 10/100
//		실버 : 3, 15% 할인적용 15/100
//		골드 : 4, 20% 할인적용 20/100
//		플레티넘 : 5, 2.7% 할인적용 27/1000
		
		
		int price = 10000;
		double cost = 0.0;
		int grade = 6;
		
		switch (grade) {
		case 1:
			cost = price * (1 -0.05);
			System.out.println("일반등급은 " + (int)cost + "원 입니다");
			break;
		case 2:
			cost = price * (1-0.1);
			System.out.println("브론즈등급은 "+ (int)cost + "원 입니다");
			break;
		case 3:
			cost = price * (1-0.15);
			System.out.println("실버등급은 "+ (int)cost + "원 입니다");
			break;
		case 4:
			cost = price * (1-0.2);
			System.out.println("골드등급은 "+ (int)cost + "원 입니다");
			break;
		case 5:
			cost = price * (1-0.027);
			System.out.println("플레티넘등급은 "+ (int)cost + "원 입니다");
			break;
		default:
			System.out.println("비회원은 정가 " + price + "원 입니다");
			break;
		}
		
		
	}

}
