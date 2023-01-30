package com.java8.streammethods;

@FunctionalInterface
interface Cab{
	void bookCab(String source);
	
}
//one lambda parameter expression
public class LamdaDemo {
	public static void main(String args[]) {
		
		/*
		 * syntax: parameter-> expression body
		 */

		Cab cab =(source)->{
		System.out.println("Booked car from:"+source);
		
			
			
		
	};
	cab.bookCab("Banglore");
	
}
}
	

