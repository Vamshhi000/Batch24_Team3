package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruitmentPages {
	
	WebDriver driver;
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
	
	
	@FindBy(xpath = "//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")
	@CacheLookup
	WebElement recruitment;
	public WebElement recruitment()
	{
	 return recruitment;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"candidateSearch_jobTitle\"]")
	@CacheLookup
	WebElement jobTitle;
	public WebElement jobTitle()
	{
	 return jobTitle;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"candidateSearch_jobVacancy\"]")
	@CacheLookup
	WebElement vacancy;
	public WebElement vacancy()
	{
	 return vacancy;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"candidateSearch_hiringManager\"]")
	@CacheLookup
	WebElement hiringManager;
	public WebElement hiringManager()
	{
	 return hiringManager;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"candidateSearch_status\"]")
	@CacheLookup
	WebElement status;
	public WebElement status()
	{
	 return status;
	 
	}
	
	
	
	@FindBy(xpath = "//*[@id=\"candidateSearch_candidateName\"]")
	@CacheLookup
	WebElement candidateName;
	public WebElement candidateName()
	{
	 return candidateName;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"candidateSearch_keywords\"]")
	@CacheLookup
	WebElement keyWord;
	public WebElement keyWord()
	{
	 return keyWord;
	 
	}
	@FindBy(xpath = "//*[@id=\"candidateSearch_modeOfApplication\"]")
	@CacheLookup
	WebElement modeOfApplication;
	public WebElement modeOfApplication()
	{
	 return modeOfApplication;
	 
	}
	
	@FindBy(xpath = "//*[@id=\"btnSrch\"]")
	@CacheLookup
	WebElement search;
	public WebElement search()
	{
	 return search;
	 
	}
	@FindBy(xpath = "//*[@id=\"resultTable\"]")
	@CacheLookup
	List<WebElement> searchResult;
	public List<WebElement> searchResult()
	{
	 return searchResult;
	 
	}
	

	
	
	@FindBy(xpath ="//*[@id=\"btnAdd\"]")
	@CacheLookup
	WebElement addBtn;
	public WebElement addBtn()
	{
	 return addBtn;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"addCandidate_firstName\"]")
	@CacheLookup
	WebElement firstName;
	public WebElement firstName()
	{
	 return firstName;
	 
	}
	
	
	@FindBy(xpath ="//*[@id=\"addCandidate_lastName\"]")
	@CacheLookup
	WebElement lastName;
	public WebElement lastName()
	{
	 return lastName;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"addCandidate_middleName\"]")
	@CacheLookup
	WebElement middleName;
	public WebElement middleName()
	{
	 return middleName;
	 
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
	
	@FindBy(xpath ="//*[@id=\"frmSrchCandidates\"]/fieldset/ol/li[7]/img")
	@CacheLookup
	WebElement from;
	public WebElement from()
	{
	 return from;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	@CacheLookup
	WebElement fromMonth;
	public WebElement fromMonth()
	{
	 return fromMonth;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	@CacheLookup
	WebElement fromYear;
	public WebElement fromYear()
	{
	 return fromYear;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a")
	@CacheLookup
	WebElement fromDate;
	public WebElement fromDate()
	{
	 return fromDate;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"frmSrchCandidates\"]/fieldset/ol/li[8]/img")
	@CacheLookup
	WebElement to;
	public WebElement to()
	{
	 return to;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/div/div/select[1]")
	@CacheLookup
	WebElement toMonth;
	public WebElement toMonth()
	{
	 return toMonth;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/div/div/select[2]")
	@CacheLookup
	WebElement toYear;
	public WebElement toYear()
	{
	 return toYear;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")
	@CacheLookup
	WebElement toDate;
	public WebElement toDate()
	{
	 return toDate;
	 
	}

	
	
	@FindBy(xpath = "//*[@id=\"resultTable\"]/tbody/tr")
	@CacheLookup
	List<WebElement> searchResultTbody;
	public List<WebElement> searchResultTbody()
	{
	 return searchResultTbody;
	 
	}
	
	
	
	
	@FindBy(xpath ="//*[@id=\"resultTable\"]/tbody/tr[1]/td[2]")
	@CacheLookup
	WebElement tableVacency;
	public WebElement tableVacency()
	{
	 return tableVacency;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"resultTable\"]/tbody/tr[1]/td[4]")
	@CacheLookup
	WebElement tableHiringManager;
	public WebElement tableHiringManager()
	{
	 return tableHiringManager;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"frmCandidateVacancyStatus\"]/fieldset/ol/li[4]/label[2]")
	@CacheLookup
	WebElement confirmShortlist;
	public WebElement confirmShortlist()
	{
	 return confirmShortlist;
	 
	}
	
	
	@FindBy(xpath ="//*[@id=\"resultTable\"]/tbody/tr[1]/td[3]")
	@CacheLookup
	WebElement tableName;
	public WebElement tableName()
	{
	 return tableName;
	 
	}
	
	@FindBy(xpath ="//*[@id=\"resultTable\"]/tbody/tr[1]/td[6]")
	@CacheLookup
	WebElement tableStatus;
	public WebElement tableStatus()
	{
	 return tableStatus;
	 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public RecruitmentPages(WebDriver driver)
	{
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	}



}
