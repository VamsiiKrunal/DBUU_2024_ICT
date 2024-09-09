package com.exep;

public class ThrowExample {
	
	public static void main(String [] args) {
		int age=17;
		try {
			if(age>18) {
				System.out.println("you may enter");
			}
			else {
				//throwing an object manually
				throw new IllegalArgumentException("under age");
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
