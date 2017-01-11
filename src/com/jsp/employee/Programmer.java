package com.jsp.employee;

class Programmer extends Employee{
	
	int bonusAmnt=10000; //instance variable
	
	public static void main(String args[]) {
		Programmer p=new Programmer();
		System.out.println("Programmer salary is:" +p.salary);  
		System.out.println("Bonus of Programmer is:" +p.bonusAmnt);
	}
}