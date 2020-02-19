package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoLoginSimplePOM {
	private WebDriver driver; 
	
	public RoLoginSimplePOM(WebDriver driver) {
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
	
	@FindBy(id="memberUsername")
	private WebElement memUserName; 
	
	@FindBy(xpath="//input[@linkurl='searchLoans?memberId=9' and @value='Submit']")
	private WebElement viewLoan;
	
	@FindBy(xpath="//img[@loanid='3']")
	private WebElement view;
	
	@FindBy(xpath="//input[@id='amountText']")
	private WebElement clear;
	
	@FindBy(xpath="//input[@id='amountText']")
	private WebElement amount;
	
	@FindBy(xpath="//input[@type='submit' and @value='Repay']")
	private WebElement repay;
	
	
		
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
//	public void clickLogoutBtn() {
//		this.logoutBtn.click(); 
//	}
	
	public void memUserName(){
		this.memUserName.sendKeys("manzoor");
	}
	
	public void viewLoan(){
		this.viewLoan.click();
	}
	
	public void view(){
		this.view.click();
	}
	
	public void clear(){
		this.clear.clear();
	}
	
	public void amount(){
		this.amount.sendKeys("1000");
	}
	
	public void repay(){
		this.repay.click();
	}
	
	
	
}
