package com.java.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		  list.add("Hasya");
		  list.add("Vathsalya");
		  list.add("Rajeshwari");
		                list.add("Prashanthi");
		                list.add("Rajeshwari");

		  System.out.println("#1 normal for loop");
		  for (int i = 0; i < list.size(); i++) {
		   System.out.println(list.get(i));
		  }

		  System.out.println("#2 advance for loop");
		  for (String temp : list) {
		   System.out.println(temp);
		  }

		  System.out.println("#3 while loop");
		  int j = 0;
		  while (list.size() > j) {
		   System.out.println(list.get(j));
		   j++;
		  }

		  System.out.println("#4 iterator");//repeating the list
		  Iterator<String> iterator = list.iterator();
		  while (iterator.hasNext()) {
		   System.out.println(iterator.next());
		  }
	}
		
}
		

	

