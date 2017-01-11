package com.jsp.employee;

public class ConstructorExample {

	int x = 3;
	int y = 5;
	
	//constructor without parameters
	public ConstructorExample() {
		System.out.println("I am constructor without params" );
	}
	
	//Parameterized constructor
	public ConstructorExample(int a, int b) {
		x = a;
		y = b;
		System.out.println("I am a constructor with 2 params");
	}

	//Addition
	public int add() throws AdditionException {
		if(x == 0 && y == 0) {
			throw new AdditionException();
		}
		int sum = x+y;
		return sum;
	}

	public static void main(String[] args) {
		//calling default constructor
		ConstructorExample constructorExample = new ConstructorExample();
		try {
			int sum1 = constructorExample.add();
			System.out.println("Addition without passing params: " + sum1);
		} catch (AdditionException e) {
			e.printStackTrace();
		}
		//calling parameterized constructor
		ConstructorExample constructorExampleWithParams = new ConstructorExample(0,0);
		try {
			int sum2 = constructorExampleWithParams.add();
			System.out.println("Addition with passing params: " + sum2);
		} catch (AdditionException e) {
			e.printStackTrace();
		}
	}
}
