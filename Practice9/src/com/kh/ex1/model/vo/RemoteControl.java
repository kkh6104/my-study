package com.kh.ex1.model.vo;

public interface RemoteControl {

	// + turnOn : void (기울어져있음)
	public abstract void turnOn();
	
	void turnOff();
	
	void setVolume(int volume);
	
}
