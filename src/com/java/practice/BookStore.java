package com.java.practice;

public class BookStore {
	public String bookName;
	public String authorName;
	public String publisherName;
	public int quantity;
	BookStore(String bName,String aName,String pName,int q){
		this.bookName=bName;
		this.authorName=aName;
		this.publisherName=pName;
		this.quantity=q;
	}
}

