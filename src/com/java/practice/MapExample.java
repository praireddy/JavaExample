package com.java.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1,"prashanthi");
		hm.put(2,"hasya");
		hm.put(3,"rajeshwari");
		hm.put(4,"vathsalya");
		System.out.println("\nExample for each...");
		  for (Object key : hm.keySet()) {
		   System.out.println("Key : " + key.toString() + " Value : " +hm.get(key));
		 
		} 
		//keyset
		Set set = hm.keySet();
		Iterator iter = set.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
