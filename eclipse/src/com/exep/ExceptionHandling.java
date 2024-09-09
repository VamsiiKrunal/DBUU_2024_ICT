package com.exep;

public class ExceptionHandling {

	public static void main(String[] args) {
			int [] array= {1,2,3,4,5};
			
			try {
				
				System.out.println(array[1]);
			} catch (Exception e) {
				System.out.println("index invalid");
				System.out.println(e.getMessage());
			}
			finally {
				System.out.println("irrespective of error");
			}
			
	}

}
