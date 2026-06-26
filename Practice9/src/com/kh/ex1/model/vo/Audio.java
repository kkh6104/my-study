package com.kh.ex1.model.vo;

public class Audio implements RemoteControl {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");			
	}

	@Override
	public void setVolume(int volume) {
		if(volume > 10) {
			System.out.println("최대 볼륨은 10입니다. 볼륨을 조절할 수 없습니다.");
		} else if(volume < 0){
			System.out.println("최대 볼륨은 0 입니다. 볼륨을 조절할 수 없습니다.");
		} else {
			System.out.println("Audio 볼륨을 " + volume + "로 조절합니다.");
			this.volume = volume;
		
		}
	}
	
	
}
