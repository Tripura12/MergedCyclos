package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.Ha_SimplePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class Ha_SimpleTests {

	private WebDriver driver;
	private String baseUrl;
	private Ha_SimplePOM loginPOM;
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
		loginPOM = new Ha_SimplePOM(driver); 
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	
	@AfterTest
	public void tearDown() throws Exception {
		Thread.sleep(10000);
		driver.quit();
	}
	@Test (priority=1)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.sendClick1();
		loginPOM.sendClick2();
		loginPOM.sendClick3();
		loginPOM.sendClick4();
		loginPOM.clickLoginBtn();
		Thread.sleep(3000);
	}
		
	@Test (priority=2)
	public void sendName() {
		loginPOM.sendName("ma");
	}
	
	@Test (priority=3)
	public void sendView() {
		loginPOM.sendView();
	}
	@Test (priority=4)
	public void sendView1() {
		loginPOM.sendView1();
	}
	@Test (priority=5)
	public void sendBack() {
		loginPOM.sendBack();
	}
		//Alert d=driver.switchTo().alert();
		//d.accept();
		//screenShot.captureScreenShot("First");
	
}
