package com.java8.optional;

import java.util.Optional;

//empty() method
public class OptionalEmpty {
	public static void main(String args[]) {
		String company="Infosys";
		String location="Banglore";
		
		
		/*
		 * empty():
		 * Returns an empty optional instance
		 */
		Optional<String> checkCompany=Optional.empty();
		System.out.println(checkCompany);
		
		
		
	}

}
