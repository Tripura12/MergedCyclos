package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KirLoginSimplePOM {
	private WebDriver driver; 
	
	public KirLoginSimplePOM(WebDriver driver) {
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
	
	@FindBy(xpath="//li[@id='menu8']/span[@class='menuText']")
	private WebElement messagenav;

	@FindBy(xpath="//li[@id='submenu8.0']/span[@class='subMenuText']")
	private WebElement messages;
	
	@FindBy(id="messageBoxSelect")
	private WebElement messagebox;
	
	@FindBy(id="categoriesSelect")
	private WebElement categorybox;
	
	@FindBy(xpath="//form[2]/table[1]/tbody/tr[2]/td/table/tbody/tr[2]/td[3]/table/tbody/tr/td[2]/a")
	private WebElement messagedet;
	
//	@FindBy(xpath="//li[@id='menu3']")
//	private WebElement logoutBtn;
//	
//	@FindBy(xpath="//input[@type='submit']")
//	private WebElement loginBtn; 
	
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
	
	public void messagenav(){
		this.messagenav.click();
	}
	
	public void messages(){
		this.messages.click();
	}
	
	public void messagebox(){
		this.messagebox.click();
	}
	
	public void categorybox(){
		this.categorybox.click();
	}
	
	public void messagedet(){
		this.messagedet.click();
	}
}
