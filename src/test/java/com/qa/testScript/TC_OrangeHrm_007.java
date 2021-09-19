package com.qa.testScript;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_OrangeHrm_007 extends TestBase
{
	@Test(dataProvider = "Sheet2")
	public void system_user(String uname,String utype,String ename, String ustatus) throws InterruptedException 
	{
		sp.admin().click();
		Thread.sleep(2000);
		
		sp.getUSERNAME().sendKeys(uname);
		Thread.sleep(2000);
		
		Select s = new Select(sp.getUSERTYPE());
		s.selectByVisibleText(utype);
		Thread.sleep(2000);
		
		sp.getEMPNAME().sendKeys(ename);
		Thread.sleep(2000);
		
		Select s1 = new Select(sp.getSTATUS());
		s1.selectByVisibleText(ustatus);
		Thread.sleep(2000);
		
		sp.ClicksearchBtn().click();
		Thread.sleep(2000);
	}
	@DataProvider(name = "Sheet2")
	public String[][] getData6() throws IOException {
		
		 
		String sheet="Sheet2";
		String[][] data= getExcelData(sheet);

		return data;
	}
	
	
	

}
