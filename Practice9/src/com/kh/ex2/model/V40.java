package com.kh.ex2.model;

public class V40 extends SmartPhone implements Phone, Camera, CellPhone, TouchDisplay, NotePen{

	public V40() {
		setMaker("LG");
	}

	@Override
	public boolean bluetoothPen() {
		return !PEN_BUTTON;
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public String charge() {
		return "고속 충전, 고속 무선 충전";
	}

	@Override
	public String picture() {
		return "1200, 1600만 트리플 카메라";
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
/*		return "V40은 "+getMaker()+"에서 만들어졌고 제원은 다음과 같다\n"
				+makeCall()+"\n"+takeCall()+"\n"+picture()+"\n"+charge()+"\n"
				+touch()+"\n"+"블루투스 펜 탑재 여부 : "+bluetoothPen(); */
		
		return String.format("V40은 %s에서 만들어졌고 제원은 다음과 같다\n"
				+"%s\n"
				+"%s\n"
				+"%s\n"
				+"%s\n"
				+"%s\n"
				+"블루투스 펜 탑재 여부 : %b"
				, getMaker(), makeCall(), takeCall(),picture(),charge(),touch(),bluetoothPen());
		
	}
}
