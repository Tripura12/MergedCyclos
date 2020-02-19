package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Ha_MediumPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Ha_MediumTests {

	private WebDriver driver;
	private String baseUrl;
	private Ha_MediumPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeTest
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeClass
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new Ha_MediumPOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		//driver.quit();
	}
	@Test (priority=1)
	public void validLoginTest() {
		
		loginPOM.sendUserName("admin");
		loginPOM.sendPassword();
		loginPOM.sendClick1();
		loginPOM.sendClick2();
		loginPOM.sendClick3();
		loginPOM.sendClick4();
		loginPOM.clickLoginBtn(); 
		screenShot.captureScreenShot("First");
	}
	@Test (priority=2)
	public void clickAdvertisements(){
		loginPOM.clickAdvertisements();
	}
	
	@Test (priority=3)
	public void clickManage(){
		loginPOM.clickManage();
	}
	
	@Test (priority=4)
	public void clickSubmit(){
		loginPOM.clickSubmit();
	}
	
	@Test (priority=5)
	public void sendName() throws InterruptedException{
		loginPOM.sendName("Selenium");
	
	}
	
	@Test (priority=6)
	public void clickSave() throws InterruptedException{
		loginPOM.clickSave();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
	}
	
	@Test (priority=7)
	public void clickHome(){
		loginPOM.clickHome();
	}
	
	@Test (priority=8)
	public void sendMemName() throws InterruptedException{
		loginPOM.sendMemName("ma");
		Thread.sleep(3000);
	}
	
	@Test (priority=9)
	public void clickManAdv(){
		loginPOM.clickManAdv();
	}
	
	@Test (priority=10)
	public void clickSubmit1(){
		loginPOM.clickSubmit1();
	}
	
	@Test (priority=11)
	public void sendTitle(){
		loginPOM.sendTitle("new offer");
	}
	
	@Test (priority=12)
	public void clickCategory(){
		loginPOM.clickCategory();
		WebElement we = driver.findElement(By.name("ad(category)"));
		Select sel = new Select(we);
		sel.selectByIndex(2);
	}
	
	@Test (priority=13)
	public void sendPrice(){
		loginPOM.sendPrice("7");
	}
	
	@Test (priority=14)
	public void clickCheckbox(){
		loginPOM.clickCheckbox();
	}
	
	@Test (priority=15)
	public void clickFrame() throws InterruptedException{
		//loginPOM.sendFrame("new offer for member");
		loginPOM.frameHandle();
		Thread.sleep(3000);
		
	}
	
	
	
	@Test (priority=16)
	public void clickSubmit2(){
		loginPOM.clickSubmit2();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	
	@Test (priority=17)
	public void clickBack(){
		loginPOM.clickBack();
	}
}
