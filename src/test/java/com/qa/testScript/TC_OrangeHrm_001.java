package com.qa.testScript;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TC_OrangeHrm_001 extends TestBase{


	@Test(dataProvider = "recruitmentSearch")
	public void Recruitment(String jobtitle,String vacency,String hiringmanager,
			String status,String CandidateName,String modeOfApplication,String dateOfApplicationYear,
			String dateOfApplicationMonth) throws IOException, InterruptedException {


		recruitmentPages.recruitment().click();
		Select jobTitles = new Select(recruitmentPages.jobTitle()); 
		jobTitles.selectByVisibleText(jobtitle);

		Select vacencies = new Select(recruitmentPages.vacancy());
		Thread.sleep(3000);
		vacencies.selectByVisibleText(vacency);  
		Thread.sleep(3000);
		Select hiringmanagers = new Select(recruitmentPages.hiringManager()); 
		Thread.sleep(3000);
		hiringmanagers.selectByVisibleText(hiringmanager); 
		Thread.sleep(3000);
		Select statuss = new Select(recruitmentPages.status()); 
		statuss.selectByVisibleText(status); 

		recruitmentPages.candidateName().sendKeys(CandidateName);

		Select modeOfApplications = new Select(recruitmentPages.modeOfApplication()); 
		modeOfApplications.selectByVisibleText(modeOfApplication);

		recruitmentPages.from().click();
		Select fromYear = new Select(recruitmentPages.fromYear()); 
		fromYear.selectByVisibleText(dateOfApplicationYear);
		Select fromMonth = new Select(recruitmentPages.fromMonth()); 
		fromMonth.selectByVisibleText(dateOfApplicationMonth);
		recruitmentPages.fromDate().click();

		recruitmentPages.to().click();     

		Select toYear = new Select(recruitmentPages.toYear()); 
		toYear.selectByVisibleText(dateOfApplicationYear);
		Select toMonth = new Select(recruitmentPages.toMonth()); 
		toMonth.selectByVisibleText(dateOfApplicationMonth);     
		recruitmentPages.toDate().click();
		recruitmentPages.search().click();

		List<WebElement> records=recruitmentPages.searchResult();
	


		if(records.size()!=0) {

			if(recruitmentPages.tableVacency().getText().equals(vacency)) {

				if(recruitmentPages.tableName().getText().equals(CandidateName)) {

					if(recruitmentPages.tableHiringManager().getText().equals(hiringmanager)) {

						if(recruitmentPages.tableStatus().getText().equals(status)) {

							Reporter.log("Acurate search result appeared");

						}else {


							captureScreenshot(driver,"Application status selected wrong");
							Reporter.log("Application status selected wrong");
							Assert.assertTrue(false);
						}

					}else {

						captureScreenshot(driver,"Hiring manager selected wrong");
						Reporter.log("Hiring manager selected wrong"); 
						Assert.assertTrue(false);
					}

				}else {


					captureScreenshot(driver,"Candidate Name Entered wrong");
					Reporter.log("Candidate Name Entered wrong"); 
					Assert.assertTrue(false);
				}

			}else {


				captureScreenshot(driver,"Vacency Selected wrong");
				Reporter.log("Vacency Selected wrong");
				Assert.assertTrue(false);
			}


		}else {

		
			captureScreenshot(driver,"Application date");
			Reporter.log("Candidates Not found");
			Assert.assertTrue(false);
		}

	}

	@DataProvider(name = "recruitmentSearch")
	public String[][] getData6() throws IOException {


		String sheet="recruitmentSearch";
		String[][] data= getExcelData(sheet);

		return data;
	}
















}
