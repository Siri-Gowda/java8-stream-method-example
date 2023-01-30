package com.java8.streammethods;

import java.util.ArrayList;
import java.util.List;


/*
 * filter () method is used to check the conditions
 * filter() method is predicate functional interface
 * Stream() is used to convert object into stream object
 */
public class FilterMethod {
	public static void main(String args[]) {
		new FilterMethod().displayFrndList();
		new FilterMethod().showGradeList();
		
	}
	private void displayFrndList() {
		List<String> frndList = new ArrayList<>();
		frndList.add("Siri");
		frndList.add("Anitha");
		frndList.add("Yasmin");
		frndList.add("Chaithu");
		frndList.add("Kishore");
		frndList.add("Vijju");
		frndList.add("Abhi");
		
		//using filter() method from predicate functional interface.
		//using stream() method from stream API
		frndList.stream().filter(frnd ->frnd.contains("Siri"))
		.forEach(frnd -> System.out.println("Hey ..My Bestie.."+frnd));
		
		//using sorted() method 
		frndList.stream().sorted().forEach(frnd -> System.out.println("My Frnds="+frnd));
		
		
	}
	private void showGradeList() {
		List<Double> grades = new ArrayList<>();
		grades.add(7.80);
		grades.add(8.20);
		grades.add(6.50);
		grades.add(9.30);
		grades.add(9.58);
		grades.stream().filter(grade ->grade <=9.58 ).
		forEach(grade -> System.out.println("grades:"+grade));
		
		//using sorted() method
		grades.stream().sorted().forEach(grade -> System.out.println("Grades in Ascending order:"+grade));
	}

}
