package com.springIoc;

public class Airtel implements Sim{

	@Override
	public void call() {
		System.out.println("calling from airtel sim");
	}

	@Override
	public void data() {
		System.out.println("using data from airtel");
	}

}
