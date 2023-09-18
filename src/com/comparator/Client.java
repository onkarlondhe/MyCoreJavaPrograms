package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
 

public class Client {

 	public static void main(String[] args) {

		ArrayList<Student> info = new ArrayList<Student>();
		
		info.add(new Student(1, "Ram", 22));
		info.add(new Student(2, "Sham", 20));
		info.add(new Student(3, "Ajay", 21));
		info.add(new Student(4, "Vijay", 23));
		
		System.out.println("***Sorting by Name***");
		
		Collections.sort(info, new NameComparator());
		
		Iterator<Student> itr = info.iterator();
		
		while(itr.hasNext()) {
			Student st = itr.next();
			System.out.println(st.id+" "+st.name+" "+st.age);	
		}
		
		
		System.out.println("\n"+"***Sorting by Age***");
		
		Collections.sort(info, new AgeComparator());
		
		Iterator<Student> itr2 = info.iterator();
		
		while(itr2.hasNext()) {
			Student st1 = itr2.next();
			System.out.println(st1.id+" "+st1.name+" "+st1.age);
		}

		
		
			
	}

}
