package com.java.practice;

class MainApp{  
	public static void main(String args[]){  
		//HDFC hdfc=new HDFC();  
		//UBI ub=new UBI();  
		//YES ys=new YES();
	//	HDFC b=(HDFC) new Bank();// we cannot assign parent to child
         Bank b = new HDFC();
	//	System.out.println("HDFC Rate of Interest: "+hdfc.getInterestRate());  
		//System.out.println("UBI Rate of Interest: "+ub.getInterestRate());  
		System.out.println("YES Rate of Interest: "+b.getInterestRate());  

	}  
}
