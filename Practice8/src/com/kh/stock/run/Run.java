package com.kh.stock.run;

import com.kh.stock.model.Device;
import com.kh.stock.model.SmartPhone;
import com.kh.stock.model.Tablet;

public class Run {

	public static void main(String[] args) {
	
		Device[] item = new Device[3];
		item[0] = new SmartPhone("Apple", "iPhone 15", 1250000, "ios");
		item[1] = new SmartPhone("Samsung", "Galaxy S24", 1150000, "Android");
		item[2] = new Tablet("Samsung", "Galaxy Tab S9", 980000, true);
	
		System.out.println("=== 매장 보유 디바이스 재고 목록 ===");
		for(Device i : item) {
			System.out.println(i.getInformation());
		}
		System.out.println("====================================");
	
	}
}
