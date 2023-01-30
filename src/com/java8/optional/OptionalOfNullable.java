package com.java8.optional;

import java.util.Optional;

//optional class
public class OptionalOfNullable {
	public static void main(String args[]) {
		
		String name =null; //specified value(T value)
		String name1 = null; //using null,returns an empty optional.
	
		
		
		/*
		 * using ofNullable(T value) Method:
		 * Returns an optional when we describe specified value,
		 * if null,otherwise returns an empty optional.
		 * 
		 */
		
		Optional<String> checkValue = Optional.ofNullable(name);
		System.out.println(checkValue);
		Optional<String> checkNull = Optional.ofNullable(name1);
		System.out.println(checkNull);
		
		if(checkValue.isPresent()) {
			System.out.println("Name is present:"+name);
		}
		if(checkNull.isPresent()) {
			System.out.println(checkNull);
		}
		
		
		
	}

}
