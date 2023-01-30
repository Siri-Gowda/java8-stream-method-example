package com.java8.optional;

import java.util.Optional;

// of(T value)method
public class OptionalOf {
	public static void main(String args[]) {
		String s = "siri";//specified not-null value(T value)
		String s1 = "Anu";
		
		/*
		 * of(T value):
		 *           Returns an optional with the specified not-null value.
		 */
		
		//using of(T value) method
		Optional<String> checkName = Optional.of(s);
		System.out.println(checkName);
		Optional<String> checkName1=Optional.of(s1);
		System.out.println(checkName1);
		
		if(checkName1.isPresent()) {
			System.out.println("My name:"+checkName1.hashCode());
		}
		
	}
	

}


