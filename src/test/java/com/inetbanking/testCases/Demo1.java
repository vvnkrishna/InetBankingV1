package com.inetbanking.testCases;

import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void Checking() {
		
		int a = 10;
		int b = 20;
		
		System.out.println(a++);
		
		
		System.out.println(b);
		
		System.out.println(a + " " + Thread.currentThread().getId());
		
		
		
	}
	

}
