package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.ComplexDbPOM;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;
import com.training.dataproviders.LoginDataProviders;

public class ComplexDbTests {

	private WebDriver driver;
	private String baseUrl;
	private ComplexDbPOM complexDbPOM;
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
		complexDbPOM = new ComplexDbPOM(driver); 
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
	
	public void validLoginTest(String memberUsername,String Amount, String Description) throws InterruptedException {
		complexDbPOM.sendUserName("admin");
		complexDbPOM.sendUserPassword();
		complexDbPOM.btn1();
		complexDbPOM.btn2();
		complexDbPOM.btn3();
		complexDbPOM.btn4();
		complexDbPOM.clicksubmitbtn();
		 Thread.sleep(3000);
		 complexDbPOM.memberUsername(memberUsername);
		 complexDbPOM.Account();
		 complexDbPOM.SystemPayment();
		 complexDbPOM.Amount(Amount);
		 complexDbPOM.Transection();
		 WebElement a=driver.findElement(By.id("type"));
		 Select sel=new Select(a);
		 sel.selectByValue("1");
		 complexDbPOM.Description(Description);
		 Thread.sleep(3000);
		 complexDbPOM.Submit();
		 Thread.sleep(2000);
		 complexDbPOM.FinalSubmit();
		
		
		
		
	}
}
