package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializationDemo {

	public static void main(String[] args) throws IOException, IOException, ClassNotFoundException {

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("Student.txt")); 
		Student st = (Student)input.readObject();
		
		
		
	}

}
