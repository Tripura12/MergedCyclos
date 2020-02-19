package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.KirLoginComplexPOM11;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class KirLoginComplexTests11 {

	private WebDriver driver;
	private String baseUrl;
	private KirLoginComplexPOM11 LoginComplexPOM11 ;
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
		LoginComplexPOM11 = new KirLoginComplexPOM11(driver); 
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
	@Test(dataProvider="db-inputs",dataProviderClass=LoginDataProviders.class)
	
	public void validLoginTest(String memberUsername, String memberName, String amount, String description) throws Exception {
		LoginComplexPOM11.sendUsername("admin");
		
		LoginComplexPOM11.password1();
		LoginComplexPOM11.password2();
		LoginComplexPOM11.password3();
		LoginComplexPOM11.password4();
		LoginComplexPOM11.clickLoginBtn();
		LoginComplexPOM11.clickAccount();
		LoginComplexPOM11.memberPaym();
		LoginComplexPOM11.memberUsername(memberUsername);
		Thread.sleep(3000);
		LoginComplexPOM11.memberName(memberName);
		
		Thread.sleep(3000);
		LoginComplexPOM11.amount(amount);
		Thread.sleep(3000);
		LoginComplexPOM11.sel();
		LoginComplexPOM11.description(description);
		LoginComplexPOM11.submitBtn1();
		LoginComplexPOM11.submitBtn2();
		 
		 
		screenShot.captureScreenShot("First");
		
	}
}
