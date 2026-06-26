package com.kh.ex1.run;

import com.kh.ex1.model.vo.Audio;
import com.kh.ex1.model.vo.RemoteControl;
import com.kh.ex1.model.vo.Television;

public class Run {

	public static void main(String[] args) {

		// 다형성을 활용하여 TV, Audio 객체를 생성 및 제어
		// => 부모 타입: RemoteControl
		// => 자식 타입: Television, Audio
		
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = new Television();
		rc[1] = new Audio();
		
		
		for(int i=0; i<2; i++) {
		rc[i].turnOn();
		if(i%2==0) {
			rc[i].setVolume(7);
		} else {
			rc[i].setVolume(5);	
		}
		rc[i].turnOff();
		if(i%2==0) System.out.println("------------------");
		}
		
	}
	
}
