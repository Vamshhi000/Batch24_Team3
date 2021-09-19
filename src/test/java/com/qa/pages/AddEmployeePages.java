package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddEmployeePages {
	WebDriver driver;
	@FindBy(id="txtUsername")
	WebElement UserName;
	
	public WebElement getUserName() {
		return UserName;
	}
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	public WebElement getPassword() {
		return Password;
		}
	
	@FindBy(id="btnLogin")
	WebElement Login;
	
	public WebElement getLogin() {
		return Login;
		
	}
	@FindBy(linkText="PIM")
	WebElement PIM;
	
	public WebElement getPIM() {
		return PIM;
	}
	
	@FindBy(id="menu_pim_addEmployee")
	WebElement addEmployee;
	public WebElement getaddEmployee() {
		return addEmployee;
	}
	@FindBy(id="firstName")
	WebElement firstName;
	
	public WebElement getfirstName() {
		return firstName;
	}
	
	@FindBy(id="middleName")
	WebElement MiddleName;
	public WebElement getMiddleName() {
		return MiddleName;
	}
	
	@FindBy(id="lastName")
	WebElement lastName;
	public WebElement getlastName() {
		return lastName;
	}
	@FindBy(id="employeeId")
	WebElement employeeId;
	public WebElement getemployeeId() {
		return employeeId;
	}
	@FindBy(id="chkLogin")
	WebElement checkLogin;
	public WebElement getcheckLogin() {
		return checkLogin;
	}
	@FindBy(id="user_name")
	WebElement userName;
	public WebElement getuserName() {
		return userName;
	}
	@FindBy(id="user_password")
	WebElement password;
	public WebElement getpassword() {
		return password;
	}
	
	@FindBy(id="re_password")
	WebElement confirmPassword;
	public WebElement getconfirmPassword() {
		return confirmPassword;
	}
	@FindBy(id="status")
	WebElement status;
	public Select getstatus() {
		Select StatusCheck = new Select(status);
		return StatusCheck;
	}
	@FindBy(id="btnSave")
	WebElement save;
	public WebElement getsave() {
		return save;
	}
	@FindBy(id="menu_pim_viewEmployeeList")
	WebElement EmployeeList;
	public WebElement getEmployeeList() {
		return EmployeeList;
	}
	@FindBy(id="empsearch_employee_name_empName")
	WebElement EmployeeName;
	public WebElement getEmployeeName() {
		return EmployeeName;
	}
	
	@FindBy(id="searchBtn")
	WebElement Search;
	public WebElement getSearch() {
		return Search;
	}
	@FindBy(xpath="//table[@id='resultTable']")
	List<WebElement> SearchEmployee;
	public List<WebElement> geSearchEmployee() {
		return SearchEmployee;
	}
		
	@FindBy(linkText="Kim")
	WebElement Kimsid;
	public WebElement getKimsid() {
		return Kimsid;
	}
	
	@FindBy(id="btnSave")
	WebElement EditInfo;
	public WebElement getEditInfo() {
		return EditInfo;
	}
	
	
	public AddEmployeePages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	

}
