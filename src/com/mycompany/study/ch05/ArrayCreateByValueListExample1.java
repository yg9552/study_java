package com.mycompany.study.ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {
		int [] scoreEnglish;
		int [] scoreMath;
		
		int[]scoreChemistry = {88,99,45,86,34};

		System.out.println("첫번째 사람 화학성적 : " + scoreChemistry[0]);
		
		String []name = {"장원영", "장동건", "고소영"};

		System.out.println("누굴까 : " + name[2]);
		
		double sum = 0;
		double avg = 0;
		
		for (int i = 0; i < scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		System.out.println("화학성적총합 : " + sum);
		System.out.println("화학성적평균 : " + (sum/scoreChemistry.length));

//		double sum = 0;
//		double avg = 0;
//		
//		for (int i = 0; i <= 4; i++) {
//			sum += scoreChemistry[i];
//		}
//		
//		avg = sum/5;
//		System.out.println(avg);
		
	}

}
