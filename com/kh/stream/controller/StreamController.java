package com.kh.stream.controller;

import com.kh.stream.model.Content;
import com.kh.stream.model.Movie;
import com.kh.stream.model.PremiumLive;
import com.kh.stream.model.User;

public class StreamController {

	User admin;
	Content[] program;
	
	public StreamController() {
		//초기화 블럭
		program = new Content[3];
		program[0] = new Movie("007", 12, 3000, true);
		program[1] = new Movie("짱구", 18, 5000, false);
		program[2] = new PremiumLive("한동숙", 18, 1500, "치지직");
	}
	
	
	public void registerUser(User u) {
		this.admin = u;
	}
	
	public User getUserInfo() {
		return admin;
	}
	
	public Content[] selectAllContents() {
		return program;
	}
	
	public int playContent(int index) {
		
		if(admin.getAge() < program[index].getAgeRestriction()) return 1;
		if(program[index] instanceof PremiumLive && admin.getAge() < program[index].getAgeRestriction() + 2) {
			return 1;
		}
		if(program[index] instanceof Movie && ((Movie)program[index]).isWinning()) {
			
			admin.setPoint(admin.getPoint() + 300);
			return 2;
		}
		return 0;
	}
}
