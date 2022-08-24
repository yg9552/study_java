package com.mycompany.study.ch06;

public class Board {

	String name = "이름";
	int views = 0;
	boolean use = false;
	
	Board() {
		
	}
	Board(String name) {
		this.name = name;
	}
	Board(String name, int views) {
		this.name = name;
		this.views = views;
	}
	Board(String name, boolean use) {
		this.name = name;
		this.use = use;
	}
	Board(String name, int views, boolean use) {
		this.name = name;
		this.views = views;
		this.use = use;
	}
	public void say() {
		System.out.println("이름 : " + name + " | 조회수 : " + views + "회" + " | 사용여부 : " + use);
	}
}
