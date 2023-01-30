package com.java8.streammethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEachMethodEx1 {
	public static void main(String args[]) {
		//creating array list
	    /*
	     * syntax:
	     * List<data-type> object-name= new ArrayList<>();
	     */
		List<String> mblList = new ArrayList<>();
		//using add method to add object names
		mblList.add("Lenovo");
		mblList.add("RedMe");
		mblList.add("Vivo");
		mblList.add("Iphone15");
		mblList.add("OnePlus");
		mblList.add("OPPO");
		
		//using forEach() method in java 8 
		//forEach() method considered as Consumer functional interface
		//forEach() method is used to process to iterate the values 
		mblList.forEach(mbl -> System.out.println(mbl.concat(" Mobile")));//using concatenation method
		//sorted method in descending order
		mblList.stream().sorted(Collections.reverseOrder()).forEach(mbl -> System.out.println(""+mbl));
		
		
		List<Character> charSet = new ArrayList<>();
		charSet.add('V');
		charSet.add('L');
		charSet.add('A');
		charSet.add('A');
		charSet.add('S');
		
		charSet.forEach(set -> System.out.println(set));
		
		//using sorted method
		charSet.stream().sorted().forEach(set -> System.out.println("Sorting Characters "+set));
		
	}

}
