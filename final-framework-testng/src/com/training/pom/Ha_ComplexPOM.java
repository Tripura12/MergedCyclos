package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ha_ComplexPOM {

private WebDriver driver; 
	
	public Ha_ComplexPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	public void sendPassword() {
		this.password.click(); 
 
	}

	
	@FindBy(xpath="//input[@value='1']")
	private WebElement click1;
	
	public void sendClick1() {
		
		this.click1.click(); 
	}
	
	
	@FindBy(xpath="//input[@value='5']")
	private WebElement click2;
	
	public void sendClick2() {
		 
		this.click2.click(); 
	}

	
	@FindBy(xpath="//input[@value='2']")
	private WebElement click3;
	
	public void sendClick3() {
		 
		this.click3.click(); 
	}

	
	@FindBy(xpath="//input[@value='4']")
	private WebElement click4;
	
	public void sendClick4() {
		 
		this.click4.click(); 
	}

	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 

	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}

	
	/*@FindBy(id="memberUsername")
	private WebElement memusername;
	
	public void memUsername(String memusername) {
		this.memusername.clear();
		this.memusername.sendKeys(memusername);
	}
	*/
	@FindBy(xpath="//li[@id='menu2']//span[@class='menuText']")
	private WebElement account;
	
	public void clickAccount()
	{
		this.account.click();
	}
	
	@FindBy(xpath="//li[@id='submenu2.4']//span[@class='subMenuText']")
	private WebElement member;
	
	public void clickMember()
	{
		this.member.click();
	}
	
	@FindBy(id="memberUsername")
	private WebElement loginRecipient;
	
	public void sendLoginRecipient(String loginRecipient){
		this.loginRecipient.sendKeys(loginRecipient);
	}
	
	@FindBy(id="amount")
	private WebElement amount;
	
	public void sendAmount(String amount){
	this.amount.sendKeys(amount);					
	}
	
	@FindBy(name="description")
	private WebElement desc;
	
	public void sendDesc(String desc){
		this.desc.sendKeys(desc);	
	}
	
	@FindBy(id="submitButton")
	private WebElement submit1;
	
	public void clickSubmit1(){
		this.submit1.click();
	}
	
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit2;
	
	public void clickSubmit2(){
		this.submit2.click();
	}
	
	@FindBy(xpath="//li[@id='menu6']//span[@class='menuText']")
	private WebElement logout;
	
	public void clickLogout(){
		this.logout.click();
	}
	
	
	@FindBy(xpath="//li[@id='submenu2.0']//span[@class='subMenuText']")
	private WebElement accInfo;
	
	public void clickAccInfo(){
		this.accInfo.click();
	}
	
	@FindBy(id="filterSelect")
	private WebElement select;
	
	public void clickSelect(){
		Select s1=new Select(select);
		s1.selectByIndex(3);
		
	}
	
	@FindBy(xpath="//img[@transferid='24']")
	private WebElement view;
	
	public void clickView(){
		this.view.click();
	}
	
	@FindBy(id="backButton")
	private WebElement back;
	
	public void clickBack(){
		this.back.click();
	}
		
	
}

