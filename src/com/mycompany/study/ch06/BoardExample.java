package com.mycompany.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		Board board = new Board();
			board.say();
		
		Board board1 = new Board("양진용");
			board1.say();
			
		Board board2 = new Board("장동건",100);
			board2.say();
			
		Board board3 = new Board("장동건", false);
			board3.say();
			
		Board board4 = new Board("고소영", 200, true);
			board4.say();
		
	}

}
