package com.training.pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class PRMemPayAndErrorMsgPOM {
private WebDriver driver; 
	
	public PRMemPayAndErrorMsgPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath="//*[@id='menu2']/span[2]")
	private WebElement account;
	
	public void accountBtn()
	{
		this.account.click();
	}
	@FindBy(xpath="//*[@id='submenu2.4']/span[2]")
	private WebElement mempay;
	public void mempayBtn()
	{
		this.mempay.click();
	}
	@FindBy(xpath="//*[@id='memberUsername']")
	private WebElement loginCheckB;
	public void loginCheckBox(String logName)
	{
		this.loginCheckB.sendKeys(logName);
	}
	@FindBy(xpath="//*[@id='memberName']")
	private WebElement memName;
	public void memNameBox(String memName)
	{
		this.memName.sendKeys(memName);
	}
	@FindBy(xpath="//*[@id='amount']")
	private WebElement amount;
	public void amountCheckBox(String amt)
	{
		this.amount.sendKeys(amt);
	}
	
	@FindBy(xpath="//*[@id='description']")
	private WebElement description;
	public void descriptionCheckBox(String des)
	{
		this.description.sendKeys(des);
	}
	//*[@id="submitButton"]
	@FindBy(xpath="//*[@id='submitButton']")
	private WebElement submit;
	public void submitBtn()
	{
		this.submit.click();
	}
	
	public void HandleAlert() throws InterruptedException
	{
		Thread.sleep(3000);
		int count=0;
		if(count==0)
		{
		Alert alt=driver.switchTo().alert();
		alt.accept();
		count++;
		}
		if(count==1)
		{
			System.out.println("Transaction type is required Error msg is diplayed");
		}
		else
		{
			System.out.println("Error msg is not diplayed");
		}
	}
}
