package com.qa.testScript;

import org.testng.annotations.Test;

public class TC_OrangeHrm_006 extends TestBase
{
	@Test()
	public void leave_list() throws InterruptedException {
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
