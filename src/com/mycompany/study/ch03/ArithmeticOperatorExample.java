package com.mycompany.study.ch03;

public class ArithmeticOperatorExample {

	public static void main(String[] args) {

		int v1 = 5;
		int v2 = 2;
		
		int result = v1 + v2;
		System.out.println(result);

		int result2 = v1 - v2;
		System.out.println(result2);

		int result3 = v1 * v2;
		System.out.println(result3);

		int result4 = v1 / v2;
		System.out.println(result4);
	
		int result5 = v1 % v2;
		System.out.println(result5);
		
		double result1 = v1 / v2;
		System.out.println(result1);
		double result6 = (double) v1 / v2;
		System.out.println(result6);
		
		
		double x = 1 + (double)2/3;
		double y = (double)5/8;
		double z = 9 + (double)4/5;
		
		double result7 = (x - y) * z;
		System.out.println("result7: " + result7);
		
		double a = 5;
		double b = 3.25;
		double c = 1+(double)5/6;
		double d = (double)12/17;

		double result8 = a - (b - c) * d;
//		double e = b - c ;
//		double result8 = a - e * d;
		System.out.println(result8);
		
//		int aa = 1;
//		int bb = 4;
//		int cc = aa+bb; //5
//		int dd = bb + cc; //9
//		int ee = aa + cc; //6
//		int ff = ee +aa; //7
//		int gg = bb + bb; //8
//		
//		int res1 = gg + ff + cc;
//		int res2 = aa + dd + cc ;
//		int res3 = cc + ee + ee;
//		int res4 = bb + ff + aa;
//		int res5 = ff + cc + cc;
//		System.out.println(res1);
//		System.out.println(res2);
//		System.out.println(res3);
//		System.out.println(res4);
//		System.out.println(res5);

		

		 
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		Average("홍길동",60,70,85,90,45);
		Average("박말순",50,75,70,60,70);
		Average("고장난",55,60,64,58,90);
		Average("도룡뇽",80,70,63,88,78);
	}
	
	public static void sum(int a, int b, int c) {
		System.out.println(a +"+"+ b +"+" +c +"=" + (a+b+c) );
		System.out.println(a+b+c);
	}
	public static void Average(String name, int english, int math, int physics, int music, int athletic) {
		System.out.println(name+ "평균:" + (double)(english+math+physics+music+athletic)/5);
	}
	
	


}
