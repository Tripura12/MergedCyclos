package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ha_SimplePOM {
	private WebDriver driver; 
	
	public Ha_SimplePOM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="cyclosUsername")
	private WebElement userName; 
	
	@FindBy(id="cyclosPassword")
	private WebElement password;
	
	@FindBy(xpath="//input[@value='1']")
	private WebElement click1;
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement click2;
	
	@FindBy(xpath="//input[@value='3']")
	private WebElement click3;
	
	@FindBy(xpath="//input[@value='4']")
	private WebElement click4;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement loginBtn; 
	
	@FindBy(id="memberUsername")
	private WebElement name;
	
	@FindBy(xpath="//tr[8]//td//fieldset//table//tbody//tr[1]//td[2]//input")
	private WebElement view;
	
	@FindBy(xpath="//img[@loanid='3']")
	private WebElement view1;
	
	@FindBy(xpath="//input[@id='backButton']")
	private WebElement back;
	
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword() {
		this.password.click(); 
		
	}
	
	public void sendClick1() {
		
		this.click1.click(); 
	}
	
	public void sendClick2() {
 
		this.click2.click(); 
	}
	
	public void sendClick3() {
 
		this.click3.click(); 
	}
	
	public void sendClick4() {
 
		this.click4.click(); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	public void sendName(String name) {
		//this.name.click();
		this.name.sendKeys(name);
	}
	
	public void sendView() {
		 
		this.view.click(); 
	}
	
	public void sendView1() {
		 
		this.view1.click(); 
	}
	
	public void sendBack() {
		 
		this.back.click(); 
	}

	
	
	 
}
