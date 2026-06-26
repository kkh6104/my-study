package com.kh.ex2.controller;

import com.kh.ex2.model.GalaxyNote9;
import com.kh.ex2.model.Phone;
import com.kh.ex2.model.SmartPhone;
import com.kh.ex2.model.V40;

public class PhoneController {

	private String[] result;
	
	public PhoneController() {
		
	}



	public String[] method() {
		this.result = new String[2];
		
		Phone[] phones = new Phone[2];
		phones[0] = new GalaxyNote9();
		phones[1] = new V40();
		
/*		result[0] = ((GalaxyNote9)phones[0]).printinfomation(); 
		result[1] = ((V40)phones[1]).printinfomation();  */
		
/*		for(int i = 0; i<2; i++) {
			if (phones[i] instanceof GalaxyNote9) {
				result[i] = ((GalaxyNote9)phones[i]).printinfomation();
			} else {result[i] = ((V40)phones[i]).printinfomation();
				
			}
		}   */
		
		int index = 0; // 결과를 담을 result 배열에서 사용할 인덱스
		for(Phone p : phones) {
			
			// Phone 타입은 printInformation() 알 수 없음!!
			if (p instanceof SmartPhone) {
				result[index++] = ((SmartPhone)p).printinfomation(); 
			}
		}
		
		return result;
		}
	
	
}
