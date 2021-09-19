package com.qa.testScript;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_ASSIGNLEAVE_001 extends TestBase
{
	@Test(dataProvider = "Sheet2")
	public void add_leave(String emp,String leavetype, String fromday, String fromdate, String year,String mnth, String comment) throws InterruptedException 
	{
		orangeHrm.leavelnk().click();
		orangeHrm.asgnleave().click();
		Thread.sleep(1000);
		//System.out.println();
		orangeHrm.empname().sendKeys(emp);
		Select s = new Select(orangeHrm.leavetype());
		s.selectByVisibleText(leavetype);
		orangeHrm.getFromDate().clear();
		//inputData[2]+", "+inputData[5]+"-"+inputData[4]+"-"+inputData[3]
	    orangeHrm.getFromDate().sendKeys(fromday+", "+fromdate+"-"+mnth+"-"+year);
	    orangeHrm.getToDate().clear();
	    orangeHrm.getToDate().sendKeys(fromday+", "+fromdate+"-"+mnth+"-"+year);
		orangeHrm.setcomment().sendKeys(comment);
		Thread.sleep(2000);
	    orangeHrm.getAssignBtn().click();
	    Thread.sleep(2000);
	}
	
	@DataProvider(name = "Sheet2")
	public String[][] getData6() throws IOException 
	{
		
		 
		String sheet="Sheet2";
		String[][] data= getExcelData(sheet);

		return data;
	}
	
	
	
}
