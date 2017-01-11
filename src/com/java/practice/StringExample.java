package com.java.practice;

public class StringExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = new String("Hello");
String name="Rajeswari";  
char ch=name.charAt(4);//returns the char value at the 4th index  
System.out.println(ch); 
//concat the string
String s1="java hello string";  
s1.concat(" java is immutable"); 
System.out.println(s1);  
s1=s1.concat("java is immutable so assign it explicitly");  
System.out.println(s1);

String s3="Hasya is new to Java";  
System.out.println(s3.endsWith("a"));  
System.out.println(s3.toUpperCase());
System.out.println(s3.toLowerCase());
System.out.println(s3.replaceFirst("Hasya", "prashanthi"));
System.out.println(s3.length());
String[] words=s3.split("\\s");//splits the string based onspace  

//for(String w:words){  
//System.out.println(w); 
String s4="Hello World  ";
//s4.trim();
System.out.println(s4.trim());
String s5="Prashanthi";
System.out.println(s5.substring(0,2));//1st index is inclusive,2nd is exclusive
System.out.println(s5.substring(3,10));
//comparing strings (true or false)
String s6="World";
String s7="world";
System.out.println(s6.equals(s7));
System.out.println(s6.equalsIgnoreCase(s7));
} 


}

	


