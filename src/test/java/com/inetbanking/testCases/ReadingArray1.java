package com.inetbanking.testCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadingArray1 {
	
	
	@Test(dataProvider = "profiles")
	public void profile(String name, String profile) {

		System.out.println("Name is : " + name);
		System.out.println("Profile is : " + profile);

	}

	@DataProvider(name = "profiles")
	public String[][] inputdata() {

		String data[][] = { { "Prabas", "Hero" }, { "Sachin", "Cricketer" }, { "RamnathKovind", "president" },
				{ "PM Modi", "Primeminister" } };

		int row = data.length;
		int col = data[0].length;

		String idata[][] = new String[row][col];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < col; j++) {

				idata[i][j] = data[i][j];
				// System.out.println(s);
			}
		}

		return idata;

	}

}
