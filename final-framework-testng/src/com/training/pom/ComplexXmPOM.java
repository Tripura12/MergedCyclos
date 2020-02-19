package com.training.pom;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.Select;

	public class ComplexXmPOM {
		private WebDriver driver; 
		
		public ComplexXmPOM(WebDriver driver) {
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
		
		@FindBy(xpath="//li[@id='menu2']//span[@class='menuText']")
		private WebElement account;
		
		@FindBy(xpath="//li[@id='submenu2.4']//span[@class='subMenuText']")
		private WebElement memberPayment;
		
		@FindBy(id="memberUsername")
		private WebElement memUsername;
		@FindBy(id="memberName")
		private WebElement memName;
		
		@FindBy(id="amount")
		private WebElement amt;
		@FindBy(id="description")
		private WebElement desc;
		@FindBy(id="submitButton")
		private WebElement subbtn;
		//Advance xpath
		
		
		public void sendUsername(String Username) {
			this.Username.sendKeys(Username);
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
		public void account() {
			this.account.click(); 
		}
		public void memberPayment(){
			this.memberPayment.click();
		}
		public void memberUsername(String memname){
		this.memUsername.sendKeys(memname);
		}
		public void memberName(String memname){
		this.memName.sendKeys(memname);
		}
		public void amount(String amt){
		this.amt.sendKeys(amt);
		}
		public void description(String des){
			this.desc.sendKeys(des);
		}
		public void subbtn(){
		this.subbtn.click();
		
		}
}



