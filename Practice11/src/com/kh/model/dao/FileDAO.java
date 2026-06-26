package com.kh.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {

	/**
	 *   java.io.File 객체를 생성하여 
	 *   해당 파일이 실제 경로에 존재하는지 여부(exists())를 boolean으로 반환함.
	 * @param file
	 * @return 존재하면 true, 존재하지 않으면 false
	 */
	
	public boolean checkName(String file) {
		File f = new File(file);
		return f.exists();
	}
	
	/**
	 *   매개변수로 들어온 파일명을 사용해 물리 파일을 생성하고,
	 *   String 내용을 파일에 기록(Output)하여 저장함.
	 * @param file
	 * @param s
	 */
	public void fileSave(String file, String s) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write(s);
			bw.flush();
		
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
	/**
	 *  매개변수로 들어온 파일명으로 파일을 찾아 내부에 저장된 데이터들을 읽어와
	 *  하나의 String으로 반환함.
	 * @param file
	 * @return
	 */
	
	public String fileOpen(String file) {
		// * 해당 파일이 존재하는 지 확인, 존재하지 않으면 "파일이 존재하지 않습니다." 리턴
		
		if(!checkName(file)) {
			return "파일이 존재하지 않습니다.";
		}
		
		String contents = "";
		try(BufferedReader br = new BufferedReader( new FileReader(file))){
			
			while(true) {
				
				String line = br.readLine();
				if (line == null) {
					break;
				}
				contents += line + "\n";
			}
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return contents;
	}
	
	
	/**
	 *  해당 파일명으로 파일을 찾은 뒤,
	 *  기존 내용 뒤에 새로운 String 내용이 이어서 저장
	 *  (FileWriter의 append 모드)될 수 있도록 구현함.
	 * @param file 	파일명
	 * @param s 	새로운 내용(추가될 내용)
	 */
	public void fileEdit(String file, String s) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))){
			bw.write(s);
			bw.flush();
		
	} catch (IOException e) {
		e.printStackTrace();
		}
	}
		
	
}
