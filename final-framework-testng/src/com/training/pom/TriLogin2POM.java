package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TriLogin2POM {

	
		private WebDriver driver; 
		
		public TriLogin2POM(WebDriver driver) {
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
		
		@FindBy(xpath="//input[@value='5']")
		private WebElement password5;
		
		@FindBy(xpath="//input[@value='6']")
		private WebElement password6;
		
		@FindBy(xpath="//input[@type='submit' and @value='Submit']")
		private WebElement loginBtn; 
		
		@FindBy(xpath="//li[@id='menu2']//span[2]")
		private WebElement clkAct;
		
		@FindBy(xpath="//li[@id='submenu2.0']//span[2]")
		private WebElement clkActInfo;
		
		@FindBy(xpath="//select[@id='filterSelect']")
		private WebElement paymentType;
		
		@FindBy(id="modeButton")
		private WebElement Adavanced;
		
		@FindBy(name="query(paymentFilter)")
		private WebElement payment;
		
		@FindBy(id="memberUsername")
		private WebElement memberLogin;
		
		@FindBy(id="memberName")
		private WebElement memberName;
		
		@FindBy(xpath="//input[@name='query(period).begin']")
		private WebElement fromDate;
		
		@FindBy(xpath="//input[@name='query(period).end']")
		private WebElement toDate;
		
		@FindBy(name="query(description)")
		private WebElement descrp;
		
		@FindBy(xpath="//input[@type='submit']")
		private WebElement clkSearch;
		
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
		public void clickPassword5(){
			this.password5.click();
			
		}
		public void clickPassword6(){
			this.password6.click();
			
		}
		public void clickLoginBtn() {
			this.loginBtn.click(); 
		}
		
		public void clickAccount(){
			this.clkAct.click();
		}
		public void clickAccountInfo(){
			this.clkActInfo.click();
		}
	public void paymentclk(){
			this.paymentType.click();
			Select p=new Select(this.paymentType);
			p.selectByIndex(0);
		}
	public void clkadvance()
	{
		this.Adavanced.click();
	}
		public void sendmemberLogin(String memberLogin){
			this.memberLogin.sendKeys(memberLogin);
		}
		public void sendmemberName(String memberName){
			this.memberName.sendKeys(memberName);
		}
		public void sendFromDate(String fromDate){
			this.fromDate.sendKeys(fromDate);
		}
		public void sendToDate(String toDate){
			this.toDate.sendKeys(toDate);
		}
		public void sendDescription(String descrp){
			this.descrp.sendKeys(descrp);
		}
		public void clkSerachbtn(){
			this.clkSearch.click();
		}
		
	}


