package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PRContactAndPaymentPOM {
private WebDriver driver; 
	
	public PRContactAndPaymentPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id='menu1']/span[2]")
	private WebElement personal;
	public void personalBtn()
	{
		this.personal.click();
	}
	
	@FindBy (xpath="//*[@id='submenu1.3']/span[2]")
	private WebElement contact;
	public void contactsBtn()
	{
		this.contact.click();
	}
	
	@FindBy (xpath="//*[@id='memberUsername']")
	private WebElement memLogin;
	public void memloginCb() throws InterruptedException
	{
		this.memLogin.sendKeys("prem99");
		Thread.sleep(3000);
	}
	
	@FindBy (xpath="//*[@id='memberName']")
	private WebElement memName;
	public void memNameCb()
	{
		this.memName.sendKeys("prem");
	}
	
	@FindBy(xpath="//*[@id='tdContents']//form//table//tbody//tr[2]//td//table//tbody//tr[3]//td//input")
	private WebElement submit;
	public void submitBtn()
	{
		this.submit.click();
	}
	
	public void AlertHandler()
	{
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	//*[@id="tdContents"]/table/tbody/tr[2]/td/div/table/tbody/tr[2]/td[1]/a
	@FindBy (xpath="//*[@id='tdContents']/table/tbody/tr[2]/td/div/table/tbody/tr[4]/td[1]/a") 
	private WebElement contactlist;
	public void contactList()
	{
		this.contactlist.click();
	}
	
	@FindBy (xpath="//*[@id='tdContents']//table[2]//tbody//tr[2]//td//table//tbody//tr[1]//td[2]//input")
	private WebElement paybtn;
	public void payBtn()
	{
		this.paybtn.click();
	}
	
	@FindBy (xpath="//*[@id='amount']")
	private WebElement amount;
	public void amountCb()
	{
		this.amount.sendKeys("500");
	}
	
	@FindBy (xpath="//*[@id='description']")
	private WebElement description;
	public void description()
	{
		this.description.sendKeys("paid");
	}
	
	@FindBy (xpath="//*[@id='submitButton']")
	private WebElement subbtn;
	public void subBtn()
	{
		this.subbtn.click();
	}
	@FindBy (xpath="//*[@id='tdContents']//form//table[1]//tbody//tr[2]//td//table//tbody//tr[6]//td//input")
	private WebElement subbtn2;
	public void transactionConfirm()
	{
		this.subbtn2.click();
	}
	@FindBy(xpath="//*[@id='backToMemberProfileButton']")
	private WebElement toMemBtn;
	public void toMemberBtn()
	{
		this.toMemBtn.click();
	}

}
