package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RoLoginComplexPOM {
private WebDriver driver; 
	
	public RoLoginComplexPOM(WebDriver driver) {
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
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement clickLoginBtn;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void password1(){
		this.password1.click();
	}
	
	public void password2(){
		this.password2.click();
	}
	
	public void password3(){
		this.password3.click();
	}
	
	public void password4(){
		this.password4.click();
	}
	
	public void clickLoginBtn() {
		this.clickLoginBtn.click(); 
	}
	
	@FindBy(xpath="//li[@id='menu2']//span[@class='menuText']")
	private WebElement accountLink;
	
	public void accountLink() {
		this.accountLink.click();
	}
	
	@FindBy(xpath="//li[@id='submenu2.4']//span[@class='subMenuText']")
	private WebElement mempayment;
	
	public void mempayment()
	{
		this.mempayment.click();
	}
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement loginName;
	
	public void loginName()
	{
		this.loginName.sendKeys("manzoor");
	}
	
	@FindBy(xpath="//input[@name='amount']")
	private WebElement amount;
	
	public void amount1(){
		this.amount.sendKeys("600");
	}
	
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement description;
	
	public void description()
	{
		this.description.click();
		this.description.sendKeys("Birthday Gift");
	}
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement submit1;
	
	public void submit1()
	{
		this.submit1.click();
	}
	

	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit2;
	
	public void submit2()
	{
		this.submit2.click();
	}
	
	@FindBy(xpath="//li[@id='menu6']//span[@class='menuText']")
	private WebElement logout;
	
	public void logout()
	{
		this.logout.click();
	}
	
	@FindBy(xpath="//li[@id='submenu2.0']//span[@class='subMenuText']")
	private WebElement accInfo;
	
	public void accInfo()
	{
		this.accInfo.click();
	}
	
	
	@FindBy(xpath="//*[@id='filterSelect']")
	private WebElement sel;
	
	public void select(){
		Select s1=new Select(sel);
		s1.selectByIndex(3);
	}
	
	@FindBy(xpath="//img[@transferid='27']")
	private WebElement view;
	
	public void view(){
	this.view.click();					
	}
	
	@FindBy(id="backButton")
	private WebElement backButton;
	
	public void backButton(){
		this.backButton.click();	
	}
	
		
	
}