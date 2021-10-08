package com.inetbanking.testCases;

public class demostatic1 {

	public static boolean isvalidnumber(String number) {
		
		if(number.matches("[0-9]{10}")) {		
		return true;
	}
	
	return false;
	
}
	
public static boolean isvalidinput(String input) {
	
	if(input.matches("[A-Z][a-z]{8}")) {
	
	return true;
	
	}
	return false;
}
	


	
}

