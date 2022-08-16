package com.mycompany.study.ch04;

public class BreakExample {

	public static void main(String[] args) {

		double num1 = 1.0;
		double num2 = 10.0;

		while(true) {
			int random = (int) ((Math.random() * (num2 + num1) - num1));
			
			System.out.println(random);
			
			if (random == 5) {
				
				break;
			}
		}
		
		System.out.println("-------------------------");
		
		for (int i = 1; i <= 10; i++){
			int random2 = (int) ((Math.random() * (num2 + num1) - num1));
			System.out.println(i + ":" + random2);
			if (random2 == 5) {
				
				break;
			}
		}
		System.out.println("-------------------------");
		aa:
		for (int j = 1; j <= 10; j++) {
			for (int i =1; i < 10; i++) {
			int random3 = (int) ((Math.random() * (num2 + num1) - num1));
			System.out.println(j + ":" + i + ":" + random3);
			if (random3 == 5) {
				
				break aa;
				//break의 차이를 이해해야함
			}
		}
		}
	}

}
