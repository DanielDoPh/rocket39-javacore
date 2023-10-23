package com.vti.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOManager {

	private static final String err_FNF= "Error! File not exist!";
	public String readFile(String filePath) {
		String rs = "";
		try {
			FileInputStream file = new 	FileInputStream(filePath);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.err.println(err_FNF);
		}
		return rs;
	}
}
