package com.mycompany.study.ch07.first;

public class DmbCellPhone extends CellPhone {
//자식
	
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	DmbCellPhone(){
		
	}
	
	//매서드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송을 켭니다");
	}
	
	void changeChannelDmb(int channel) {
		System.out.println("채널을 " + channel + "번으로 변경합니다");
	}
	
	void turnOffDmb() {
		System.out.println("DMB수신을 끕니다");
	}
}