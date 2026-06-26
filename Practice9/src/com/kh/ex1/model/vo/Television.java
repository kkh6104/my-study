package com.kh.ex1.model.vo;

public class Television implements RemoteControl{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// 최대 볼륨 10, 최소 볼륨 0으로 제한
		// => 전달 받은 값(volume)의 범위 제한
		
		if(0 <= volume && volume <= 10) {
			this.volume = volume;
			System.out.printf("TV 볼륨을 %d로 조절합니다.\n", this.volume);
		} else {
			System.out.println("Tv 볼륨 범위에 해당되지 않습니다. 조절할 수 없습니다.");
			return;
		}
	}
	
	
	
}
