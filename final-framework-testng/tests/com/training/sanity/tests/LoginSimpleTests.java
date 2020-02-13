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
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginSimplePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class LoginSimpleTests {

	private WebDriver driver;
	private String baseUrl;
	private LoginSimplePOM loginSimplePOM;
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
		loginSimplePOM = new LoginSimplePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void validLoginTest() throws InterruptedException {
		loginSimplePOM.sendUserName("admin");
		loginSimplePOM.password1();
		loginSimplePOM.password2();
		loginSimplePOM.password3();
		loginSimplePOM.password4();
		loginSimplePOM.clickLoginBtn();
		
		
		Thread.sleep(3000);
		loginSimplePOM.messagenav();
		loginSimplePOM.messages();
		WebElement a=driver.findElement(By.id("messageBoxSelect"));
	    Select sel =new Select(a);
	    sel.selectByValue("INBOX");
		
	    WebElement b=driver.findElement(By.id("categoriesSelect"));
	    Select sel1 =new Select(b);
	    sel.selectByIndex(1);
	    Thread.sleep(1000);
	    loginSimplePOM.messagedet();
		screenShot.captureScreenShot("First");
	}
}
