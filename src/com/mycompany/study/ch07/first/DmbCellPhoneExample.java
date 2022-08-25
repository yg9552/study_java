package com.mycompany.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		// 부모 객체를 생성하고 powerOn 실행
		CellPhone cellPhone = new CellPhone();
		
		cellPhone.powerOn();
		
		// 자식 객체를 생성 하고 DMB 끄기
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOffDmb();
		
		// 생성자를 이용하여 자식객체를 생성
		DmbCellPhone dmbCellPhone2 = new DmbCellPhone("IPhone 12 Pro", "퍼시픽블루", 10);
		
//		dmbCellPhone2 객체를 이용하여 자식 클래스의 매서드 출력
		dmbCellPhone2.turnOnDmb();
		dmbCellPhone2.changeChannelDmb(1);
		dmbCellPhone2.turnOffDmb();
		
//		dmbCellPhone2 객체를 이용하여 부모 클래스의 매서드 출력
		dmbCellPhone2.powerOn();
		dmbCellPhone2.bell();
		dmbCellPhone2.sendVoice("ㄴㅁㅇㄹㄴㅇㅁㄹㅈㄷㄱ");
		dmbCellPhone2.receiveVoice("ㄴㅁㅇㄹㄴㅇㅁㄹㅈㄷㄱ");
		dmbCellPhone2.hangUp();
		dmbCellPhone2.powerOff();
	}

}
