package com.jsp.parent;

public class Child extends Parent{
	public static void main(String args[]) 
	{
		Child c = new Child();
		int sum = c.add(10, 20, 30);
	System.out.println("the addition of 3 numbers = "+sum);	
	}
	

}
