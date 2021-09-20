package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemUserPage 
{
	WebDriver driver;
	public SystemUserPage(WebDriver driver)
	{
		this.driver=driver;
		 PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath = "//*[@id=\"txtUsername\"]")
	@CacheLookup
	WebElement userName;
	public WebElement userName()
	{
	 return userName;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"txtPassword\"]")
	@CacheLookup
	WebElement password;
	
	public WebElement password()
	{
	 return password;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"btnLogin\"]")
	@CacheLookup
	WebElement login;
	public WebElement login()
	{
	 return login;
	 
	}
	
	@FindBy(xpath = "//b[contains(text(),'Admin')]")
	@CacheLookup
	WebElement Admin;
	public WebElement admin()
	{
	 return Admin;
	 
	}
	
	@FindBy(xpath = "//input[@id='btnAdd']")
	@CacheLookup
	WebElement UserAdd;
	public WebElement ClickUserAdd()
	{
		return UserAdd;
	 
	 
	}
	
	@FindBy(xpath = "//select[@id='systemUser_userType']")
	@CacheLookup
	WebElement userType;
	public WebElement setuserType()
	{
	 return userType;
	 
	}
	
	@FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
	@CacheLookup
	WebElement empName;
	public WebElement setempName()
	{
	 return empName;
	 
	}
	
	@FindBy(xpath = "//input[@id='systemUser_userName']")
	@CacheLookup
	WebElement UserName;
	public WebElement setUserName()
	{
	 return UserName;
	 
	}
	
	
	
	@FindBy(xpath = "//select[@id='systemUser_status']")
	@CacheLookup
	WebElement Userstatus;
	public WebElement setUserstatus()
	{
	 return Userstatus;
	 
	}
	
	@FindBy(xpath = "//input[@id='systemUser_password']")
	@CacheLookup
	WebElement Userpwd;
	public WebElement setUserpwd()
	{
	 return Userpwd;
	 
	}
	
	@FindBy(xpath = "//input[@id='systemUser_confirmPassword']")
	@CacheLookup
	WebElement cnfrmpwd;
	public WebElement setcnfrmpwd()
	{
	 return cnfrmpwd;
	 
	}
	
	@FindBy(xpath = "//input[@id='btnSave']")
	@CacheLookup
	WebElement Usersave;
	public WebElement setUsersave()
	{
	 return Usersave;
	 
	}
	
/*	@FindBy(xpath = "//*[@id=\"resultTable\"]")
	@CacheLookup
	List<WebElement> searchResult;
	public List<WebElement> searchResult()
	{
	 return searchResult;
	 
	}*/
	
	@FindBy(xpath ="//input[@id='searchSystemUser_userName']")
	@CacheLookup
	WebElement USERNAME;
	public WebElement getUSERNAME()
	{
	 return USERNAME;
	 
	}
	
	
	@FindBy(xpath ="//select[@id='searchSystemUser_userType']")
	@CacheLookup
	WebElement USERTYPE;
	public WebElement getUSERTYPE()
	{
	 return USERTYPE;
	 
	}
	
	@FindBy(xpath ="//input[@id='searchSystemUser_employeeName_empName']")
	@CacheLookup
	WebElement EMPNAME;
	public WebElement getEMPNAME()
	{
	 return EMPNAME;
	 
	}
	
	
	@FindBy(xpath ="//select[@id='searchSystemUser_status']")
	@CacheLookup
	WebElement STATUS;
	public WebElement getSTATUS()
	{
	 return STATUS;
	 
	}
	
	@FindBy(xpath ="//input[@id='searchBtn']")
	@CacheLookup
	WebElement searchBtn;
	public WebElement ClicksearchBtn()
	{
	 return searchBtn;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"addCandidate_email\"]")
	@CacheLookup
	WebElement email;
	public WebElement email()
	{
	 return email;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"addCandidate_vacancy\"]")
	@CacheLookup
	WebElement cVacency;
	public WebElement cVacency()
	{
	 return cVacency;
	 
	}
	
	
	@FindBy(xpath ="//*[@id=\"addCandidate_contactNo\"]")
	@CacheLookup
	WebElement contactNo;
	public WebElement contactNo()
	{
	 return contactNo;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	@CacheLookup
	WebElement saveCus;
	public WebElement saveCus()
	{
	 return saveCus;
	 
	}
	
	@FindBy(xpath ="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol[2]/li[1]/div/div/select")
	@CacheLookup
	WebElement selectAction;
	public WebElement selectAction()
	{
	 return selectAction;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"btnSave\"]")
	@CacheLookup
	WebElement editBtn;
	public WebElement editBtn()
	{
	 return editBtn;
	 
	}
	@FindBy(xpath ="//*[@id=\"actionBtn\"]")
	@CacheLookup
	WebElement shortlist;
	public WebElement shortlist()
	{
	 return shortlist;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"ohrmList_chkSelectAll\"]")
	@CacheLookup
	WebElement checkBox;
	public WebElement checkBox()
	{
	 return checkBox;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"btnDelete\"]")
	@CacheLookup
	WebElement delete;
	public WebElement delete()
	{
	 return delete;
	 
	}
	@FindBy(xpath ="//*[@id=\"dialogDeleteBtn\"]")
	@CacheLookup
	WebElement deleteOk;
	public WebElement deleteOk()
	{
	 return deleteOk;
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
