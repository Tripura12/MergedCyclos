package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TriLogin1POM {
private WebDriver driver; 
	
	public TriLogin1POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='button' and @value='Submit']")
	private WebElement clkSubBut;
	
	@FindBy(name="member(user).username")
	private WebElement loginName;
	
	@FindBy(name="member(name)")
	private WebElement fullName;
	
	@FindBy(name="member(email)")
	private WebElement email;
	
	@FindBy(xpath="//input[@fieldname='birthday']")
	private WebElement birthday;
	
	@FindBy(id="_radio_2_0")
	private WebElement gender;
	
	@FindBy(xpath="//input[@fieldname='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@fieldname='postalCode']")
	private WebElement code;
	
	@FindBy(xpath="//input[@fieldname='city']")
	private WebElement city;
	
	@FindBy(id="custom_field_select_6")
	private WebElement area;
	
	@FindBy(xpath="//input[@fieldname='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@fieldname='mobilePhone']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@fieldname='fax']")
	private WebElement fax;
	
	@FindBy(xpath="//input[@fieldname='url']")
	private WebElement url;
	
	@FindBy(xpath="//input[@type='password' and @name='member(user).password']")
	private WebElement pass;
	
	@FindBy(xpath="//input[@type='password' and @name='confirmPassword']")
	private WebElement confirm;
	
	@FindBy(xpath="//input[@name='captcha']")
	private WebElement captcha;
	
	@FindBy(xpath="//input[@id='saveButton']")
	private WebElement saveBtn;
	
	@FindBy(id="btn")
	private WebElement popokbtn;
	
	
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
	
	@FindBy(xpath="//table//tbody//tr[2]//td//fieldset//table//tbody//tr[1]//td[4]//input")
	private WebElement changeBtn;
	
	@FindBy(name="newGroupId")
	private WebElement groupId;
	
	@FindBy(id="comments")
	private WebElement commentsBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement SubmitBtn;
	
	public void clicksubmit1(){
		this.clkSubBut.click();
	}
	
	public void sendloginName(String loginName ){
		this.loginName.sendKeys(loginName);
	}
	
	public void sendFullName(String fullName){
		this.fullName.sendKeys(fullName);
	}
	
	public void sendEmail(String email){
		this.email.sendKeys(email);
	}
	
	public void sendBirthday(String birthday){
		this.birthday.sendKeys(birthday);
	}
	
	public void clickgender(){
		this.gender.click();
	}
	public void sendAdress(String address){
		this.address.sendKeys(address);
	}
	public void sendPostalCode(String code){
		this.code.sendKeys(code);
	}
	public void sendCity(String city){
		this.city.sendKeys(city);
	}
	public void sendArea(){
		this.area.click();
		Select s=new Select(this.area);
		s.selectByVisibleText("Example area");
	}
	public void sendPhone(String phone){
		this.phone.sendKeys(phone);
	}
	public void sendMobile(String mobile){
		this.mobile.sendKeys(mobile);
	}
	public void sendFax(String fax){
		this.fax.sendKeys(fax);
	}
	public void sendUrl(String url){
		this.url.sendKeys(url);
	}
	public void sendPass(String pass){
		this.pass.sendKeys(pass);
	}
	public void sendConfirm(String confirm){
		this.confirm.sendKeys(confirm);
	}
	public void sendCaptcha(){
		this.captcha.click();
	}
	
	public void clickSave(){
		this.saveBtn.click();;
	}
	
	
	public void clickOkBtn(){
		this.popokbtn.click();;
	}
		
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
		this.memberUserName.sendKeys(memberUserName);
	}
	
	public void ClickChangeBtn(){
		this.changeBtn.click();
	}
	public void clickGroupid(){
		this.groupId.click();
	}
	
	public void sendCommentBox(String commentsBox) {
		this.commentsBox.sendKeys(commentsBox);
	}
	
	public void clickSubmitBtn() {
		this.SubmitBtn.click();
	}

}
