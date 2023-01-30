package com.java8.streammethods;


//Functional Interface:it contains only one abstraction method


@FunctionalInterface
interface displayable{
	void display(String msg);
}
public class FunctionalInterface1 implements displayable {
	
	public void display(String msg) {
		System.out.println(msg);
		
	}
	public static void main(String args[]) {
	FunctionalInterface1	 dis = new FunctionalInterface1();
	dis.display("Welcome to Lamda Expression by Siri");
			
		
			}
		
	}



