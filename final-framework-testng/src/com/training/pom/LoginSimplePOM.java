package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginSimplePOM {
	private WebDriver driver; 
	
	public LoginSimplePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")//by inspecting we need to take id
	private WebElement Username ; 
	
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	@FindBy(xpath="//tr//tr//td//input [@value='Submit']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//li[@id='menu3']//span[@class='menuText']")
	private WebElement account; 
	
	@FindBy(xpath="//li[@id='submenu3.6']//span[@class='subMenuText']")
	private WebElement memberPaym;
	
	@FindBy(xpath="//input[@id='memberUsername']")
	private WebElement memberUsername;
	
	@FindBy(xpath="//input[@id='memberName']")
	private WebElement memberName;
	
	@FindBy(xpath="//input[@id='amount']")
	private WebElement amount;
	 
	@FindBy(xpath="//textarea[@id='description']")
	private WebElement description;
	
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement subbtn1;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement subbtn2;
	
	public void sendUsername(String Username) {
		this.Username.clear();
		this.Username.sendKeys("admin");
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
		this.loginBtn.click(); 
	}
	public void clickAccount() {
		this.account.click(); 
	}
	public void memberPaym() {
		this.memberPaym.click(); 
	}
	
	public void memberUsername(String mUserName) {
		this.memberUsername.sendKeys("pinkubhui"); 
	}
	public void memberName(String MemName) {
		this.memberName.sendKeys("pinkubhui"); 
	}
	public void amount(String num){
		this.amount.sendKeys("4567899");
	}
	
	public void description(String des){
		this.amount.sendKeys("trying");
	}
	public void submitBtn1(){
		this.subbtn1.click();
	}
	
	public void submitBtn2(){
		this.subbtn2.click();
	}

	@FindBy(id="type")//by inspecting we need to take id
	private WebElement type ;
	
	
	public void sel(){
	Select sel=new Select(type);
	
	 sel.selectByIndex(1);
	}	
	
	
}
