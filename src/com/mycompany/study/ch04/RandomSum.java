package com.mycompany.study.ch04;

public class RandomSum {

	public static void main(String[] args) {

//		1~100사이의 랜덤 정수 2개를 발생시켜
//		두 수 사이의 합을 구하라
//		double num1 = 1;
//		double num2 = 100;
//		int sum = 0, min = 0, max = 0;
//		
//		int random1 = (int) (Math.random() * (num1 + num2));
//		int random2 = (int) (Math.random() * (num1 + num2));
//		System.out.println(random1);
//		System.out.println(random2);
//		if (random1 < random2) {
//			int min = random1;
//			int max = random2;
//			} else (random1 > random2) {
//				int min =random2;
//				int max = random1;
//			}
//		for (int i = min; i <= max; i++) {
//			sum += i;
//			System.out.println(i+sum);
//		}
//		
//		
		
//		두 수의 합
//		double min = 1;
//		double max = 100;
//		int random1 = (int) (Math.random() * (max + min));
//		int random2 = (int) (Math.random() * (max + min));
//		System.out.println(random1);
//		System.out.println(random2);
//		System.out.println(random1+ " + " + random2 + " = " + (random1 + random2));
//		}
		
		
		
		
//		로또 번호 추출기
//		double min = 1.0;
//		double max = 45.0;
//		
//		for (int i = 1; i <= 6; i++) {
//			int random = (int) (Math.random() * (max + min));
//			System.out.println(i + " = " + random);
//			
//		}
		
		
		// 1 ~ 100 사이의 랜덤 정수 2개를 발생시켜
		// 두 수 사이의 합을 구하라
		
		double num1 = 1.0;
		double num2 = 100.0;
		
		int sum = 0, min = 0, max = 0;
		
		int random1 = (int) ((Math.random() * (num2 - num1)) + num1);
		int random2 = (int) ((Math.random() * (num2 - num1)) + num1);
		
		if (random1 < random2) {
			max = random2;
			min = random1;
		} else {
			max = random1;
			min = random2;
		}
		
		System.out.println("min : " + min + ", " + "max : " + max);
		
		for (int i = min; i <= max; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
		}
		
		System.out.println("total : " + sum);

		
//		여기서 부터 정민님 소스
//		Random rand = new Random();
//		
//		int num1 = rand.nextInt(100);
//		int num2 = rand.nextInt(100);
//		
//		int sum = 0;
//		
//		if(num1 > num2) {
//			for(int i = num2 ; i <= num1; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num1) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
//		} else {
//			for(int i = num1 ; i <= num2; i++) {
//				sum += i;
//				System.out.print(i + " + ");
//				if(i == num2) System.out.print(i + " ");
//			}
//			System.out.print(" = " + sum);
////			System.out.println(num1 + " ~ " + num2 + " 사이의 합은 " + sum);
//		}
	}

}
