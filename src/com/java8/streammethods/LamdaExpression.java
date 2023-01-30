package com.java8.streammethods;

@FunctionalInterface
interface Mobile{  //Functional Interface 
	void bookMobile();	
}

public class LamdaExpression {
	public static void main(String args[]) {
		
		Mobile mobile = new Mobile() {

			
			public  void bookMobile() {
				System.out.println("Mobile Booked !!Arriving soon!!");
				
			}
			
		
	};
	mobile.bookMobile();
	
	/*
	 * syntax: parameter-> expression body
	 */

	}
}
