package com.java.practice;

public class StaticExample {
//1.A static method can be accessed using Class name
//2.we don't need to create an instance(object) to access a static method.
//3.A static method can only be accessed from static method.
//4.A non-static method can be accessed from static method through an instance.
	
	//static method
	public static void print() {
		System.out.println("print is called");
	}
	
	//non-static method
	public int sum(int a, int b) {
		//3 TODO this call to static method from non-static method shouldn't work but its working why ??????
		//StaticExample.print();
		return a+b;
	}
	
	public static void main(String[] args) {
		//1 & 2 
		StaticExample.print();
		//4
		StaticExample se = new StaticExample();
		se.sum(1,2);
	}
}
