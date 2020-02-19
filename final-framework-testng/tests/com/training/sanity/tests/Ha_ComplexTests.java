package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Ha_ComplexPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Ha_ComplexTests {
	private WebDriver driver;
	private String baseUrl;
	private  Ha_ComplexPOM complexPOM1;
	private Ha_ComplexPOM complexPOM;
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
		//testPOM = new TestPOM(driver); 
		complexPOM=new Ha_ComplexPOM(driver);
		complexPOM = new Ha_ComplexPOM(driver);
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
	@Test
	public void validLoginTest() throws InterruptedException {
		complexPOM.sendUserName("haritha");
		complexPOM.sendPassword();
		complexPOM.sendClick1();
		complexPOM.sendClick2();
		complexPOM.sendClick3();
		complexPOM.sendClick4();
		complexPOM.clickLoginBtn(); 
		
		Thread.sleep(3000);
	}
	@Test (priority=1)
	public void payment() throws InterruptedException{
		complexPOM.clickAccount();
		complexPOM.clickMember();
		complexPOM.sendLoginRecipient("ma");
		Thread.sleep(3000);
		complexPOM.sendAmount("2000");
		complexPOM.sendDesc("Birthday gift");
		complexPOM.clickSubmit1();
		complexPOM.clickSubmit2();
		complexPOM.clickLogout();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		}
	@Test (priority=3)
	public void login() throws InterruptedException{
		complexPOM.sendUserName("haritha");
		complexPOM.sendPassword();
		complexPOM.sendClick1();
		complexPOM.sendClick2();
		complexPOM.sendClick3();
		complexPOM.sendClick4();
		complexPOM.clickLoginBtn(); 
		
		Thread.sleep(3000);
		
	}
	
	@Test (priority=4)
	public void view(){
		complexPOM.clickAccount();
		complexPOM.clickAccInfo();
		complexPOM.clickSelect();
		complexPOM.clickView();
	}
	
	@Test (priority=5)
	public void back(){
		complexPOM.clickBack();
	}
}