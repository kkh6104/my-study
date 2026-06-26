package com.kh.controller;

import com.kh.model.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();
	
	public boolean checkName(String file) {
		return fd.checkName(file);
	}
	
	public void fileSave(String file, String s) {
		fd.fileSave(file, s);
	}
	
	public String fileOpen(String file) {
		
		return fd.fileOpen(file);
	}
	
	public void fileEdit(String file, String s) {
		fd.fileEdit(file, s);
	}
	
	
}
