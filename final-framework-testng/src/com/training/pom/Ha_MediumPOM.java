package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ha_MediumPOM {
	private WebDriver driver; 
	
	public Ha_MediumPOM(WebDriver driver) {
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
	
	
	@FindBy(xpath="//input[@value='2']")
	private WebElement click2;
	
	public void sendClick2() {
		 
		this.click2.click(); 
	}

	
	@FindBy(xpath="//input[@value='3']")
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
	
	
	@FindBy(xpath="//li[@id='menu6']//span[@class='menuText']")
	private WebElement advertisements;
	
	public void clickAdvertisements(){
		this.advertisements.click();
	}
	
	
	@FindBy(xpath="//li[@id='submenu6.1']//span[@class='subMenuText']")
	private WebElement manage;
	
	public void clickManage(){
		this.manage.click();
	}
	
	
	@FindBy(id="newButton")
	private WebElement clickSubmit;
	
	public void clickSubmit(){
		this.clickSubmit.click();
	}
	
	
	@FindBy(name="category(name)")
	private WebElement sendName;
	
	public void sendName(String sendName){
		
		this.sendName.click();
		this.sendName.sendKeys(sendName);
	}
	
	
	@FindBy(id="saveButton")
	private WebElement save;
	
	public void clickSave(){
		this.save.click();
	}
	
	
	@FindBy(xpath="//li[@id='menu0']//span[@class='menuText']")
	private WebElement home;
	
	public void clickHome(){
		this.home.click();
	}
	
	
	@FindBy(id="memberUsername")
	private WebElement memName;
	
	public void sendMemName(String memName){
		this.memName.clear();
		this.memName.sendKeys(memName);
	}
	
	
	@FindBy(xpath="//input[@linkurl='memberAds?memberId=9']")
	private WebElement manAdv;
	
	public void clickManAdv(){
		this.manAdv.click();
	}
	
	
	@FindBy(id="newButton")
	private WebElement clickSubmit1;
	
	public void clickSubmit1(){
		this.clickSubmit1.click();
	}
	
	
	@FindBy(name="ad(title)")
	private WebElement title;
	
	public void sendTitle(String title){
		this.title.clear();
		this.title.sendKeys(title);
	}
	
	
	@FindBy(name="ad(category)")
	private WebElement category;
	
	public void clickCategory(){
		this.category.click();
	}
	
	
	@FindBy(name="ad(price)")
	private WebElement price;
	
	public void sendPrice(String price){
		this.price.click();
		this.price.clear();
		this.price.sendKeys(price);
	}
	
	
	@FindBy(name="ad(permanent)")
	private WebElement checkbox;
	
	public void clickCheckbox(){
		this.checkbox.click();
	}
	
	
	@FindBy(tagName="iframe")
	private WebElement frame;
	
	public void frameHandle(){
		this.frame.sendKeys("new offer for member");
	}
	
	@FindBy(id="saveButton")
	private WebElement submit2;
	
	public void clickSubmit2(){
		this.submit2.click();
	}
	
	
	@FindBy(id="backButton")
	private WebElement back;
	
	public void clickBack(){
		this.back.click();
	}
}
