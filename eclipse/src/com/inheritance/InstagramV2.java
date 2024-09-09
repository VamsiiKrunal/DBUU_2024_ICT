package com.inheritance;

public class InstagramV2 extends InstagramV1 {

	
	public static void main(String[] args) {
		InstagramV2 v2object=new InstagramV2();
		//were changing the location baki poora same
		v2object.messageLoction="lefttop";
		System.out.println(v2object.messageLoction);
		v2object.searchbar(); 
	}

}
