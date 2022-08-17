package com.mycompany.study.ch04;


public class ForExample {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			String string = "**********";
			System.out.println(string);
		}
		
		
		System.out.println("---------------------");
		
		for (int i = 1; i <= 5; i++) {
			String string = "*        *";
			String string2 = "**********";
			if (i == 1 || i == 5) {
				System.out.println(string2);
			} else {
				System.out.println(string);
			}
		}
		
		System.out.println("---------------------");
		
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
			System.out.print(j);
			} System.out.println();
		}
		for (int i =1; i < 10; i++) {
			if (i%2 == 0) {
				System.out.print(" ");
			} else {
				System.out.print(i);
			}
		} System.out.println(0);
		
	}
}
		
	


