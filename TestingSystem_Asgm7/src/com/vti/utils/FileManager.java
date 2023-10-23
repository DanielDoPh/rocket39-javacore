package com.vti.utils;

import java.io.File;

public class FileManager {

	public boolean isFileExists(String filepath) {
		File file = new File(filepath);
		if(file.exists())
			return true;
		return false;
	}
	
	public void createNewFile(String filepath) {
		File file = new File(filepath);
		//Use FIleManager...
		if(file.exists()) {
			
		}
	}
}
