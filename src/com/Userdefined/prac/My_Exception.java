package com.Userdefined.prac;

public class My_Exception extends Exception {

	public My_Exception(String string) {
		System.out.println(string);
		System.out.println("Exception Handle");
	}

}
