package com.mycompany.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "양진용";
		String str2 = "양진용";
		String str3 = new String("양진용");
		
		boolean result1 = str1 == str2;
		System.out.println(result1);
		
		boolean result2 = str1 == str3;
		boolean result3 = str2 == str3;
		System.out.println(result2);
		System.out.println(result3);
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		
	}

}
