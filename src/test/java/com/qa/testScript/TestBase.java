package com.qa.testScript;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AddEmployeePages;
import com.qa.pages.RecruitmentPages;
import com.qa.pages.SystemUserPage;
import com.qa.utility.ExcelUtility;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	WebDriver driver=null;
	RecruitmentPages recruitmentPages;
<<<<<<< HEAD
	SystemUserPage sp;
=======
	AddEmployeePages addEmployeePages;
>>>>>>> 23c6714606cf841921cd75843afb645abc8889fa
	
	@Parameters({ "OrangeHrmURL","Browser"})
	@BeforeClass
	public void Setup(String OrangeHrmURL,String browserName) throws IOException {
		if (browserName.equalsIgnoreCase("Chrome")) 
		{
			
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		
		}		
		else if (browserName.equalsIgnoreCase("Edge")) 
		{

			WebDriverManager.edgedriver().setup();

			driver =new EdgeDriver();
			


		}
		recruitmentPages = new RecruitmentPages(driver);
<<<<<<< HEAD
		sp = new SystemUserPage(driver);
=======
		 addEmployeePages = new AddEmployeePages(driver);
>>>>>>> 23c6714606cf841921cd75843afb645abc8889fa
		driver.get(OrangeHrmURL);
		
		
		Properties properties= new Properties();
		String projectPath=System.getProperty("user.dir");
		InputStream input= new FileInputStream(projectPath+"\\src\\test\\java\\com\\qa\\testData\\login.properties");
		properties.load(input);
		driver.manage().window().maximize();
		recruitmentPages.userName().sendKeys(properties.getProperty("UserName"));
		recruitmentPages.password().sendKeys(properties.getProperty("Password"));
		recruitmentPages.login().click();
		



	}

	@AfterClass
	public void TearDown() throws InterruptedException {

		//driver.quit();
	}

	public void captureScreenshot(WebDriver driver,String tname) throws IOException {

		TakesScreenshot ts = (TakesScreenshot)driver;

		File source = ts.getScreenshotAs(OutputType.FILE);
		File target= new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");

		FileUtils.copyFile(source, target);
		System.out.println("Screenshot captured");



	}	

	public String[][] getExcelData(String sheet) throws IOException{
<<<<<<< HEAD
		String path="C:\\Users\\INDIA\\Desktop\\OrangeHrmGitHub\\shiva\\OrangeHrm_Automation\\src\\test\\java\\com\\qa\\testData\\test.xlsx"; 
=======
		String path="C:\\Users\\INDIA\\Desktop\\OrangeHrmGitHub\\git project\\OrangeHrm_Automation\\src\\test\\java\\com\\qa\\testData\\orangeHrm_inputData.xlsx"; 
>>>>>>> 23c6714606cf841921cd75843afb645abc8889fa
		ExcelUtility excelUtils =new ExcelUtility(path,sheet);

		int rowCount=excelUtils.getRowCount();
		int colCount=excelUtils.getColCount();

		String data[][] = new String[rowCount-1][colCount];

		for(int i=1;i<rowCount;i++) {
			for(int j=0;j<colCount;j++) {
				if(excelUtils.getCellType(i, j)) {
					String cellData= excelUtils.getCellDataString(i, j);

					data[i-1][j]=cellData;
				}	else {
					double cellData= excelUtils.getCellNumaricString(i, j);

					int intVal=(int)cellData;
					String s=Integer.toString(intVal);
					data[i-1][j]=s;

				}

			}
		}


		return data;



	}
	



}
