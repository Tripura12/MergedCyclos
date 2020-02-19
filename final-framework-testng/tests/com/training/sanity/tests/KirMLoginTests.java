package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class KirMLoginTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginPOM loginPOM;
	private static Properties properties;
	private ScreenShot screenShot;

	@BeforeClass
	public static void setUpBeforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	}

	@BeforeMethod
	public void setUp() throws Exception {
		driver = DriverFactory.getDriver(DriverNames.CHROME);
		loginPOM = new LoginPOM(driver); 
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
	public void validLoginTest() throws InterruptedException   {
		loginPOM.sendUserName("admin");
		loginPOM.Password1();
		loginPOM.Password2();
		loginPOM.Password3();
		loginPOM.Password4();
		loginPOM.clickLoginBtn(); 
		loginPOM.messagesBtn();
		loginPOM.messages1Btn();
		loginPOM.loginBtn1();
		loginPOM.sendusername("kumar");
		loginPOM.sendname("kumar");
		loginPOM.sendText("hiii");
		loginPOM.sendbody("hello");
		loginPOM.loginBtn2(); 
		Alert a=driver.switchTo().alert();
		a.accept();
		loginPOM.logoutBtn2();
		Alert a1=driver.switchTo().alert();
		a1.accept();
		loginPOM.sendUserName1("kumar");
		loginPOM.Passwordd1();
		loginPOM.Passwordd2();
		loginPOM.Passwordd3();
		loginPOM.Passwordd4();
		loginPOM.clickLoginBtn11(); 
		loginPOM.personalBtn();
		loginPOM.msgBtn();
		loginPOM.msgdetails();
		loginPOM.back();
		loginPOM.logoutt();
		Alert b1=driver.switchTo().alert();
		b1.accept();
	
		//screenShot.captureScreenShot("First");
	}
	
}
