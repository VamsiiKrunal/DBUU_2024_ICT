package com.strings;

public class Main {

	public static void main(String[] args) {
		String s1="hello";
		String s2=new String("hello");
		
		for(int i=0;i<s1.length();i++) {
				char temp=s1.charAt(i);
				System.out.println(temp);
		}
		
	}

}
