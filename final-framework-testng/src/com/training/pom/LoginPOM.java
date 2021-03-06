package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPOM {
	private WebDriver driver; 
	
	public LoginPOM(WebDriver driver) {
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
	@FindBy(xpath="//li[@id='menu2']//span[@class='menuText']")
	private WebElement account; 
	
	@FindBy(xpath="//li[@id='submenu2.0']//span[@class='subMenuText']")
	private WebElement Acc_Info;
	
	@FindBy(id="modeButton")
	private WebElement modeButton ;
	
	@FindBy(id="memberUsername")
	private WebElement memberUsername;
	
	@FindBy(name="query(period).begin")
  private WebElement datebox;
	//@FindBy(id="calendarTrigger0")//by inspecting we need to take id
//	private WebElement datebox ;
	
	@FindBy(name="query(period).end")
	private WebElement dateBox1;
	 
	@FindBy(name="query(description)")
	private WebElement description;
	
	@FindBy(name="query(paymentFilter)")//by inspecting we need to take id
	private WebElement type ;
	
	@FindBy(id="memberName")
	private WebElement memberName;
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement subbtn1;
		
	
	
	public void clickAccount() {
		this.account.click(); 
	}
	public void accountInformation() {
		this.Acc_Info.click(); 
	}
	
	public void modeButton() {
		this.modeButton.click(); 
	}
	public void memberUsername(String MemName) {
		this.memberUsername.sendKeys("Piku"); 
	}
	public void memberName(String name){
		this.memberName.sendKeys("Piku");
	}
	public void description(String des){
		this.description.sendKeys("trying");
	}
	public void dateBox(String num){
		this.datebox.sendKeys("12/02/2019");
	}	
	public void dateBox1(String num){
		this.dateBox1.sendKeys("12/02/2019");
	}
	public void sel1(){
		Select sel=new Select(type);
		
		 sel.selectByIndex(1);
		}	
	public void submitBtn1(){
		this.subbtn1.click();
	}


		
	
	
	
	
	
}
