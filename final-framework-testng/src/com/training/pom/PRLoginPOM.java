package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PRLoginPOM {
	private WebDriver driver; 
	
	public PRLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	//@FindBy(id="password")
	//private WebElement password;
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement loginBtn;

	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	public void password1()
	{
		this.password1.click();
	}
	public void password2()
	{
		this.password2.click();
	}
	public void password3()
	{
		this.password3.click();
	}
	public void password4()
	{
		this.password4.click();
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click();  
	}

//	public void sendPassword(String password) {
//		this.password.clear(); 
//		this.password.sendKeys(password); 
//	}
	
	@FindBy(xpath="//*[@id='menu0']/span[2]")
	private WebElement homebtn;
	public void home()
	{
		this.homebtn.click();
	}
	@FindBy(xpath="//*[@id='memberUsername']")
	private WebElement memlogCb;
	public void memberloginfo(String str)
	{
		this.memlogCb.sendKeys(str);
	}
	@FindBy(xpath="//*[@id='tdContents']//table[1]//tbody//tr[2]//td//table//tbody//tr[5]//td//fieldset//table//tbody//tr[1]//td[2]//input")
	private WebElement accountinfo;
	public void accountInfoBtn()
	{
		this.accountinfo.click();
	}
	@FindBy(xpath="//*[@id='tdContents']//table[1]//tbody//tr[3]//td//table//tbody//tr[2]//td[5]//img")
	private WebElement view;
	public void viewBtn()
	{
		this.view.click();
	}
	@FindBy(xpath="//*[@id='backButton']")
	private WebElement back;
	public void backBtn()
	{
		this.back.click();
	}
	@FindBy(xpath="//*[@id='menu15']/span[2]")
	private WebElement logout;
	public void clickLogoutBtn()
	{
		this.logout.click();
	}
	
}
