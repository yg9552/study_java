package com.mycompany.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

		double num1 = 1.0;
		double num2 = 100.0;
		int min = 0; int max = 0;
		
		int random1 = (int) (Math.random() * (num1 + num2) - num1);
		int random2 = (int) (Math.random() * (num1 + num2) - num1);
		
		if (random1 < random2){
			min = random1;
			max = random2;
		} else {
			min = random2;
			max = random1;
		}
		System.out.println("min" + "="+ min +" max" + "=" + max);
		int sum = 0;
		
		for (int i = min; i<= max; i++) {
			sum += i;
			System.out.println(sum);
		}
	}

}
