package com.mycompany.study.ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {

		int[][] scores = {{99,88,55},{55,77,66},{55,55,44},{55,55,44},{55,55,77}};
		
		System.out.println("scores[4][2] : " + scores[4][2]);
		System.out.println("scores[3][0] : " + scores[3][0]);
		System.out.println("scores[2][1] : " + scores[2][1]);
		System.out.println("scores[1][2] : " + scores[1][2]);
		System.out.println("scores[0][1] : " + scores[0][1]);
		
		String[] name = {"양진용","장동건","고소영","이정재","정우성"};
		String[] subject = {"수학","과학","영어"};
		
//		1. 개인의 평균

		for(int i = 0; i < 5; i++) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				sum += scores[i][j];
			} 
//			System.out.println(name[i] + "의 평균 : " + (double)sum/3);
			System.out.println(name[i] + "의 평균 : " + (double)sum/scores[i].length);
		}
		
//		2. 과목별 평균
		
//		for(int j = 0; j < 3; j++) {
//			int sum1 = 0;
//			for (int i = 0; i < 5; i++) {
//				sum1 += scores[i][j];
//			} 
//			System.out.println(subject[j] +"의 평균 : " + (double)sum1/5);
//		} 
		
		int[]sum2 = new int[3];
		for(int i = 0; i < scores.length; i++) {
			for (int j = 0; j <scores[i].length; j++) {
				sum2[j] += scores[i][j];
			}
		}
		for(int i = 0; i <sum2.length; i++) {
			System.out.println((double) sum2[i]/scores.length);
		}
		
	}

}
