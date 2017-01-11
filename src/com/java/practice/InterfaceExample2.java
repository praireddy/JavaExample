package com.java.practice;

class InterfaceExample2  implements  PrintExample {  
	public void print(){
		System.out.println("Hello i am new to interface");
	}  
	static int c=0;
	public void sum(){
		int a=10;
		int b=5;
		c=a+b;
		System.out.println("sum is" +c);
		
	}
	
	public static void main(String args[]){  
		PrintExample  obj = new InterfaceExample2();  
		obj.print();  
		obj.sum(); 
	}
}
