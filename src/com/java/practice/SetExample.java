package com.java.practice;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.*;

public class SetExample {
	public static void main(String[] args){
		HashSet<String> hs = new HashSet<String>();//Hashset contains no order
		System.out.println("Hashset output");
		hs.add("prashanthi");
		hs.add("vathsalya");
		hs.add("rajeshwari");
		hs.add("hasya");
		hs.add("rajeshwari");
		//Traversing elements  
		Iterator<String> itr=hs.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		} 
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();  
		System.out.println("LinkedHashset output");
		//TreeSet<String> ts= new TreeSet<String>();//treeSet maintains alphabetical order
		lhs.add("prashanthi");
		lhs.add("vathsalya");
		lhs.add("rajeshwari");
		lhs.add("hasya");
		lhs.add("rajeshwari");
		for(String s:lhs){
			System.out.println(lhs);
		}
	}

}
