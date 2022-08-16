package com.mycompany.study.ch04;

public class DoWhilePrintFrom1To10Example {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			System.out.println(i +":"+ sum);
			i++;
		} while (i <=10);

	}

}
