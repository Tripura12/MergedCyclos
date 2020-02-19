package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.AccountInforPOM;
import com.training.pom.ComplexXmPOM;
import com.training.pom.LoginPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class ComplexTests {
	private WebDriver driver;
	private String baseUrl;
	private ComplexXmPOM  complexXmPOM;
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
		complexXmPOM = new ComplexXmPOM(driver); 
		//accInfoPOM= new AccountInforPOM(driver);
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
	
  @Test(dataProvider="Cyclos",dataProviderClass=LoginDataProviders.class)
  public void validLoginTest(String Member_Login, String Amount,String Description) throws Exception {
	  complexXmPOM.sendUsername("Piku");
		
	  complexXmPOM.password1();
	  complexXmPOM.password2();
	  complexXmPOM.password3();
	  complexXmPOM.password4();
	  complexXmPOM.clickLoginBtn();
	  
	  complexXmPOM.account();
	  complexXmPOM.memberPayment();
	  complexXmPOM.memberUsername(Member_Login);
	  complexXmPOM.memberName(Member_Login);
	  complexXmPOM.amount(Amount);
	  complexXmPOM.description(Description);
	 
	  complexXmPOM.subbtn();
  }
}

