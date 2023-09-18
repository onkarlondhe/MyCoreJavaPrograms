package com.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, IOException {

		Student st = new Student(1,"Ram");
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Student.txt"));
		
		out.writeObject(st);
		out.flush();
		out.close();
		System.out.println("Run Successfully...");
	}

}
