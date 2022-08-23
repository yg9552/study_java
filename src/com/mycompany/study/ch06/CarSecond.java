package com.mycompany.study.ch06;

public class CarSecond {
	
//	String color = "black";
//	int cc = 1500;
//	int tire = 19;
//	String name = "G70";
//	
//	CarSecond(String str) {
//		color = str;
//		name = str;
//	}
//	CarSecond(int num) {
//		cc = num;
//		tire = num;
//	}
//	
//	CarSecond(){
//		
//	}
	
	String name = "아반떼";
	int cc;
	String color;
	
//	CarSecond(String str) {
//		name = str;
//	}
//	
//	CarSecond (String str, int num) {
//		name = str;
//		cc = num;
//	}
//	CarSecond (String str, int num, String str2) {
//		name = str;
//		cc = num;
//		color = str2;
//	}
	
//	기본생성자
	CarSecond () {
		
	}
	
	CarSecond(String name) {
		this.name = name;
	}
	CarSecond(int cc) {
		this.cc = cc;
	}
	CarSecond(String name, int cc) {
		this.name = name;
		this.cc = cc;
	}
	CarSecond(String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
}
