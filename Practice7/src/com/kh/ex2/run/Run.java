package com.kh.ex2.run;

import com.kh.ex2.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book book1 = new Book();
		book1.setTitle("객체지향의 사실과 오해");
		book1.setPublisher("위키북스");
		book1.setAuthor("조영호");
		book1.setPrice(25000);
		book1.setDiscountRate(0.1);
		Book book2 = new Book("클린 코드", "인사이트", "로버트 C. 마틴" );
		book2.setPrice(38000);
		book2.setDiscountRate(0.15);
		Book book3 = new Book("실용주의 프로그래머", "인사이트", "앤드류 헌트, 데이비드 토마스", 35000, 0.15);

		book1.inform();
		book2.inform();
		book3.inform();
		
		
	
	}
}
