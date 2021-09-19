package com.qa.testScript;

import org.testng.annotations.Test;

public class TC_LEAVELIST_002 extends TestBase
{
	@Test(dataProvider = "Sheet2")
	
	public void leave_list(String emp) throws InterruptedException {
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		orangeHrm.leavelnk().click();
		Thread.sleep(3000);
		orangeHrm.listleave().click();
		orangeHrm.getLeavelist().click();
		Thread.sleep(3000);

		orangeHrm.getempname().sendKeys("Goutham Ganesh");
		Thread.sleep(3000);
		orangeHrm.getSearchBtn().click();
	}
	
	
	 

}
