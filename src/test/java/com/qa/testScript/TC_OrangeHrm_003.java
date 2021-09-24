package com.qa.testScript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_OrangeHrm_003 extends TestBase {


	@Test(priority=0, dataProvider="example")
	public void addqualification(String x,String y) throws InterruptedException {
	Thread.sleep(2000);
	ORM.getAdmin().click();
	Thread.sleep(3000);
	ORM.getQualifications().click();	
	Thread.sleep(3000);
	ORM.getSkills().click();
	Thread.sleep(3000);
	ORM.getAdd().click();
	Thread.sleep(3000);
	ORM.getName().sendKeys(x);
	Thread.sleep(3000);
	ORM.getDescription().sendKeys(y);
	Thread.sleep(3000);
	ORM.getSave().click();
}
	
	@DataProvider(name = "example")
	public String[][] getData6() throws IOException {
		
		 
		String sheet="Example";
		String[][] data= getExcelData(sheet);

		return data;
	}
}
