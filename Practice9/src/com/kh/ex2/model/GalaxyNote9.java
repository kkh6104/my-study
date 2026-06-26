package com.kh.ex2.model;

// 부모 클래스와 인터페이스를 동시에 상속시킬 경우
// class 자식 클래스명 extends 부모클래스 implements 인터페이스,,, {}
public class GalaxyNote9 extends SmartPhone implements Phone, Camera, CellPhone, TouchDisplay, NotePen  {

	public GalaxyNote9() {
		setMaker("삼성");
	}

	@Override
	public boolean bluetoothPen() {
		return PEN_BUTTON;
	}

	@Override
	public String touch() {
		return "정전식, 와콤펜 지원";
	}

	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String picture() {
		return "1200만 듀얼 카메라";
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화 버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "수신 버튼을 누름";
	}

	@Override
	public String printinfomation() {
/*		return "갤럭시 노트9는 "+getMaker()+"에서 만들어졌고 제원은 다음과 같다\n"
				+makeCall()+"\n"+takeCall()+"\n"+picture()+"\n"+charge()+"\n"
				+touch()+"\n"+"블루투스 펜 탑재 여부 : "+bluetoothPen();  */
		
		return String.format("갤럭시 노트9은 %s에서 만들어졌고 제원은 다음과 같다\n"
				+"%s\n"
				+"%s\n"
				+"%s\n"
				+"%s\n"
				+"%s\n"
				+"블루투스 펜 탑재 여부 : %b"
				, getMaker(), makeCall(), takeCall(),picture(),charge(),touch(),bluetoothPen());
		
		
	}
	
	

	
}
