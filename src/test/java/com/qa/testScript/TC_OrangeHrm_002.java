package com.qa.testScript;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_OrangeHrm_002 extends TestBase{



	@Test(dataProvider = "addCandidate")
	public void addCustomer(String firstName,String middleName,String lastName,
			String email,String vacency,String number,String selectActionn) throws IOException, InterruptedException {
		recruitmentPages.recruitment().click();
		recruitmentPages.addBtn().click();
		recruitmentPages.firstName().sendKeys(firstName);
		recruitmentPages.middleName().sendKeys(middleName);
		recruitmentPages.lastName().sendKeys(lastName);

		recruitmentPages.email().sendKeys(email);
		recruitmentPages.contactNo().sendKeys(number);
		Select cVacency = new Select(recruitmentPages.cVacency()); 
		cVacency.selectByVisibleText(vacency);
		recruitmentPages.saveCus().click(); 
		Thread.sleep(3000);
		Select selectAction = new Select(recruitmentPages.selectAction());
		Thread.sleep(3000);
		selectAction.selectByVisibleText(selectActionn);

		recruitmentPages.shortlist().click();

		if(recruitmentPages.confirmShortlist().getText().equals("Shortlisted")) {

			Reporter.log("Candidate added and Updated his Status");
		}else {

			captureScreenshot(driver,"Candidates Not added and Updated his Status");
			Reporter.log("Candidates Not added and Updated his Status");
			Assert.assertTrue(false);
		}
	}



	@DataProvider(name = "addCandidate")
	public String[][] getData6() throws IOException {


		String sheet="addCandidate";
		String[][] data= getExcelData(sheet);

		return data;
	}
}
