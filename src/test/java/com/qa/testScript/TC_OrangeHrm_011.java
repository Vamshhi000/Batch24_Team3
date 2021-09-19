package com.qa.testScript;



import java.io.IOException;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class TC_OrangeHrm_011 extends TestBase{
	@Test(priority=0,dataProvider="AddEmployee")
	public void addEmployee(String firstName,String lastName, String userName,String password, String confirmpassword) throws InterruptedException, IOException {
		//Assert.assertTrue(false);
		addEmployeePages.getPIM().click();
		addEmployeePages.getaddEmployee().click();
		addEmployeePages.getfirstName().sendKeys(firstName);
		Reporter.log("First Name entered");
		addEmployeePages.getlastName().sendKeys(lastName);
		Reporter.log("Last Name entered");
		Thread.sleep(2000);
		Thread.sleep(2000);
		addEmployeePages.getcheckLogin().click();
		Thread.sleep(2000);
		addEmployeePages.getuserName().sendKeys(userName);
		Reporter.log("UserName entered");
		Thread.sleep(2000);
		addEmployeePages.getpassword().sendKeys(password);
		Reporter.log("Password entered");
		Thread.sleep(2000);
		addEmployeePages.getconfirmPassword().sendKeys(confirmpassword);
		Reporter.log("ConfirmPassword entered");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		addEmployeePages.getstatus().getFirstSelectedOption();
		 Thread.sleep(3000);
		 addEmployeePages.getsave().click();
	   
	     
	     String currentUrl = driver.getCurrentUrl();
			if(currentUrl.contains("viewPersonalDetails")) {
				Reporter.log("Employee is saved and personal information page is displayed");
				Assert.assertTrue(true);
			}else {
				captureScreenshot(driver,"AddEmployee");
				Reporter.log("Failed to save!!..UserName exists");
				Assert.assertTrue(false);
			}
		
		 Thread.sleep(3000);
		}
	
	@DataProvider(name = "AddEmployee")
	public String[][] AddEmployee() throws IOException {
		
		 
		String sheet="AddEmployee";
		String[][] data= getExcelData(sheet);

		return data;
	}
	
	@Test(priority=1,dataProvider="getEmployeeRecord",dependsOnMethods="addEmployee",alwaysRun=true)
	public void getEmployeeRecord(String EmployeeName) throws InterruptedException, IOException {
		addEmployeePages.getPIM().click();
		Thread.sleep(3000);
		addEmployeePages.getEmployeeList().click();
		Thread.sleep(3000);
		addEmployeePages.getEmployeeName().sendKeys(EmployeeName);
		Reporter.log("Employee Name is entered");
		Thread.sleep(3000);
		addEmployeePages.getSearch().click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		Thread.sleep(4000);
		
		List<WebElement> EmployeeRecord=addEmployeePages.geSearchEmployee();
		
		System.out.println(EmployeeRecord.size()); 
		
		if(EmployeeRecord.size()!=0) {
			Reporter.log("Employee is found");
			for(WebElement Ename  : EmployeeRecord ) {
				Reporter.log("Employee Record :" +Ename.getText());
			}
			Assert.assertTrue(true);
			
		}else {
			captureScreenshot(driver,"getEmployeeRecord");
			Reporter.log("Employee is not found");
			Assert.assertTrue(false);
		}
		
	}
	@DataProvider(name = "getEmployeeRecord")
	public String[][] getEmployeeRecord() throws IOException {
		
		 
		String sheet="getEmployeeRecord";
		String[][] data= getExcelData(sheet);

		return data;
	}

}
