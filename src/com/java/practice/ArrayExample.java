package com.java.practice;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]=new int[5];//declaration and instantiation 
	try
	{
		arr[0]=10;//initialization  
		arr[1]=20;  
		arr[2]=30;  
		arr[3]=40;  
		arr[4]=50;  
		arr[5]=60;//Exception
		arr[6]=80;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Exception occured=="+e);
	}
		//printing array  
		for(int i=0;i<arr.length;i++)//length is the property of array  
			System.out.println(arr[i]); 
		//second way to do
		int a[]={33,3,4,5};//declaration, instantiation and initialization  

		//printing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
			System.out.println(a[i]); 

	}

}
