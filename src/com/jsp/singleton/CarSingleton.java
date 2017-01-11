package com.jsp.singleton;

/**
 * 
 * This is a singleton class. 
 * The object of this class is returned by getCarSingletonObject
 * @author Prashanthi
 *
 */
class CarSingleton {
	
	CarSingleton carSingletonObject = null;
	
	public CarSingleton getCarSingletonObject() {
		if(carSingletonObject == null){
			carSingletonObject = new CarSingleton();
		}
		return carSingletonObject;
		
	}
	
	private CarSingleton() {
		System.out.println("constructor");
	}
} 

