package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class OrangeHRMpages {
	
	WebDriver driver;
	
	public OrangeHRMpages(WebDriver driver1) {
		// TODO Auto-generated constructor stub
		driver=driver1;
		PageFactory.initElements(driver1, this);
		
	}
	
	@FindBy(id="menu_admin_viewAdminModule")
	WebElement Admin;
	
	public WebElement getAdmin(){
		return Admin;
	}
	
	@FindBy(xpath="//*[@id='menu_admin_Qualifications']")
	WebElement Qualifications;
	
	public WebElement getQualifications(){
		return Qualifications;
	}
	
	@FindBy(id="menu_admin_viewSkills")
	WebElement Skills;
	
	public WebElement getSkills(){
		
		return Skills;
	}
	

	@FindBy(id="btnAdd")
	WebElement Add;
	
	public WebElement getAdd(){
		return Add;
	}

	@FindBy(id="skill_name")
	WebElement Name;
	
	public WebElement getName(){
		return Name;
	}
	@FindBy(id="skill_description")
	WebElement Description;
	
	public WebElement getDescription(){
		return Description;
	}
	@FindBy(id="btnSave")
	WebElement Save;
	
	public WebElement getSave(){
		return Save;
	}
	
	
}
