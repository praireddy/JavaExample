package com.java.practice;

import java.util.LinkedList;
import java.util.List;

public class LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<BookStore> list = new LinkedList<BookStore>();
		BookStore b1= new BookStore("Disney","walt Disney","abc",5);//assigning values to constructor
		BookStore b2= new BookStore("Disney1","walt Disney1","abc1",6);
		BookStore b3= new BookStore("Disney2","walt Disney2","abc2",7);
		BookStore b4= new BookStore("Disney3","walt Disney3","abc3",8);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		for(BookStore b:list){
			// System.out.println(b.bookName);
			//System.out.println(b.authorName);
			//System.out.println(b.publisherName);
			//System.out.println(b.quantity);
			System.out.println(b.bookName+" "+b.authorName+" "+b.publisherName+" "+b.quantity);
		}
		System.out.println("#1 normal for loop");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}


	}

}
