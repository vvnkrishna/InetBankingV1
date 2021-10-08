package com.inetbanking.testCases;

import org.testng.annotations.Test;

public class Demo3 {
	
	
	@Test
	public void reverse() {
		
		
		String s ="I love India";
		
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb.reverse());
		
		System.out.println("Test id" + Thread.currentThread().getId());
		
	}
	


}
