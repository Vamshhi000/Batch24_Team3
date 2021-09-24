package com.qa.testScript;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_OrangeHrm_008 extends TestBase
{
	@Test(dataProvider = "Sheet1")
	public void user_add(String type, String emp,String user, String status, String pwd, String cpwd) throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sp.admin().click();
		Thread.sleep(3000);
		
		
		sp.ClickUserAdd().click();
		Thread.sleep(3000);
		
		
		
		Select s = new Select(sp.setuserType());
		s.selectByVisibleText(type);
		Thread.sleep(3000);
		
		sp.setempName().sendKeys(emp);
		Thread.sleep(3000);
		
		sp.setUserName().sendKeys(user);
		Thread.sleep(3000);
		
		Select s1 = new Select(sp.setUserstatus());
		s1.selectByVisibleText(status);
		Thread.sleep(3000);
		
		sp.setUserpwd().sendKeys(pwd);
		Thread.sleep(3000);
		
		sp.setcnfrmpwd().sendKeys(cpwd);
		Thread.sleep(3000);
		
		sp.setUsersave();
		Thread.sleep(3000);
	}
	
	@DataProvider(name = "Sheet1")
	public String[][] getData6() throws IOException {
		
		 
		String sheet="Sheet1";
		String[][] data= getExcelData(sheet);

		return data;
	}
	
}
