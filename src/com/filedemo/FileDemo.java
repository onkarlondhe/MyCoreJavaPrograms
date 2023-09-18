package com.filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) {

		File obj = new File("C:\\MyFile.txt");
		try {
			if(obj.createNewFile())
				System.out.println("file is created..");
			else
				System.out.println("file is already created...");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
