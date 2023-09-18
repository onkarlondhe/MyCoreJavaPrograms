package com.datedemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat date = new SimpleDateFormat("dd:MM:YY hh:mm:ss a");
		System.out.println(date.format(d));
		
	}

}
