package com.qa.testScript;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_001 extends TestBase{
	
	@Test(dataProvider = "Example")
	public void Recruitment(String x,String y) {
		
		recruitmentPages.recruitment().click();
		
	System.out.println(x+"    "+y);
	}
	@DataProvider(name = "Example")
	public String[][] getData6() throws IOException {
		
		 
		String sheet="Example";
		String[][] data= getExcelData(sheet);

		return data;
	}
}
