package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TriLoginPOM {
	private WebDriver driver; 
	
	public TriLoginPOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement password1;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement password2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement password3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement password4;
	
	@FindBy(xpath="//input[@type='submit' and @value='Submit']")
	private WebElement loginBtn; 
	
	@FindBy(xpath="//li[@id='menu0']//span[2]")
	private WebElement clkHome;
	
	@FindBy(id="memberUsername")
	private WebElement memberUserName;
	
	@FindBy(xpath="//tbody//tr[8]//td//fieldset//table//tbody//tr[1]//td[2]//input")
	private WebElement loanClk;
	
	@FindBy(xpath="//input[@value='CLOSED']")
	private WebElement closeClk;
	
	@FindBy(xpath="//input[@value='OPEN']")
	private WebElement openClk;
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword() {
		this.password.click(); 
		
	}
	
	public void clickPassword1(){
		this.password1.click();
		
	}
	
	public void clickPassword2(){
		this.password2.click();
		
	}
	public void clickPassword3(){
		this.password3.click();
		
	}
	public void clickPassword4(){
		this.password4.click();
		
	}
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	public void ClickHome(){
		this.clkHome.click();
	}
	public void sendMemberUserName(String memberUserName){
		this.memberUserName.clear();
		this.memberUserName.sendKeys(memberUserName);
	}
	public void sendLoanClk(){
		this.loanClk.click();
	}
	public void ClickClose(){
		this.closeClk.click();
	}
	public void ClickOpen(){
		this.openClk.click();
	}
	
	
}
