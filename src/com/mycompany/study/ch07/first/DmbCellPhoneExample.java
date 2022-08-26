package com.mycompany.study.ch07.first;


public class DmbCellPhoneExample {

	public static void main(String[] args) {
		
		//부모 객체 생성해서 매소드 출력
		CellPhone cellPhone = new CellPhone();
		cellPhone.powerOn();
		cellPhone.bell();
		cellPhone.powerOff();
		
		//자식 객체 생성해서 자식, 부모 메서드 출력
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Galaxy Z플립 4", "핑크골드", 10);
		System.out.println("모델명 : " + dmbCellPhone.model + " | 색상 : " + dmbCellPhone.color);
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(29);
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.powerOn();
		dmbCellPhone.sendVoice("가나다라마바사");
		dmbCellPhone.receiveVoice("아자차카타파하");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		
	}

}
