package com.mycompany.study.ch10.third;

public class BoxMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box = Util.boxing(100);
		
		int rtInteger = box.getT();
		System.out.println(rtInteger);
		
		System.out.println(box.getT());
		
		Box<String> box2 = Util.boxing("백");
		
		String rtString = box2.getT();
		System.out.println(rtString);
		
		System.out.println(box2.getT());

	}

}
