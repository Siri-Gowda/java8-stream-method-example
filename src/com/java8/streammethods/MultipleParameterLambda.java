package com.java8.streammethods;

//multiple parameter lambda expression
@FunctionalInterface
interface Tv{
	void bookTv(String source,String destination,String price);
	
	}

public class MultipleParameterLambda {
	public static void main(String args[]) {
		
		/*
		 * syntax: parameter-> expression body
		 */

		Tv tv =(source,destination,price)->{
			System.out.println("Tv booked from..." + source+" to..."+ destination+"!!Arriving Soon with "+price);
			
			
			
			
			
		};
		tv.bookTv("Banglore", "Gvp","30k");
	}

}
