package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.TriLogin1POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TriLogin1Tests {
	private WebDriver driver;
	private String baseUrl;
	private TriLogin1POM login1POM;
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
		login1POM = new TriLogin1POM(driver); 
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
		login1POM.clicksubmit1();
		login1POM.sendloginName("ksundari");
		login1POM.sendFullName("ksundari");
		login1POM.sendEmail("ksundari@gmail.com");
		login1POM.sendBirthday("12/02/2020");
		login1POM.clickgender();
		login1POM.sendAdress("12-08");
		login1POM.sendPostalCode("567896");
		login1POM.sendCity("hyderabad");
		login1POM.sendArea();
		login1POM.sendPhone("7856444123");
		login1POM.sendMobile("9878546787");
		login1POM.sendFax("456786");
		login1POM.sendUrl("www.goggle.com");
		login1POM.sendPass("123456");
		login1POM.sendConfirm("123456");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(-500,document.body.scrollHeight)" );
		login1POM.sendCaptcha();
		Thread.sleep(7000);
		login1POM.clickSave();
		Thread.sleep(3000);
		login1POM.clickOkBtn();
		login1POM.sendUserName("admin");
		login1POM.sendPassword();
		login1POM.clickPassword1();
 		login1POM.clickPassword2();
		login1POM.clickPassword3();
		login1POM.clickPassword4();
		login1POM.clickLoginBtn(); 
		login1POM.ClickHome();
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollTo(-500,document.body.scrollHeight)" );
		login1POM.sendMemberUserName("ksundari");
		login1POM.ClickChangeBtn();
		login1POM.clickGroupid();
		login1POM.sendCommentBox("beautiful");
		login1POM.clickSubmitBtn();
		
		
		screenShot.captureScreenShot("First");

	}

}
