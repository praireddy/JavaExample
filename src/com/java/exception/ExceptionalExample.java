package com.java.exception;

public class ExceptionalExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
	try
	{	int value=10/0;  //
	String s=null;  
	System.out.println(s.length());//NullPointerException  
	}
	catch(Exception e){
		System.out.println("Exception occured=="+e);
	}
	finally
	{System.out.println("finally");}

		
		System.out.println("rest of the code");

	}

}
