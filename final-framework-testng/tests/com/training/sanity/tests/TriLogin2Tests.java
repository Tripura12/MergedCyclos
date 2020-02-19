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
import com.training.pom.TriLogin2POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class TriLogin2Tests {

		private WebDriver driver;
		private String baseUrl;
		private TriLogin2POM login2POM;
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
			login2POM = new TriLogin2POM(driver); 
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
		
		@Test(dataProvider="cyclos", dataProviderClass=LoginDataProviders.class)
		public void test(String Member_Login,String	Description)
		{
		login2POM.sendUserName("tripura");
		login2POM.sendPassword();
		login2POM.clickPassword1();
		login2POM.clickPassword2();
		login2POM.clickPassword3();
		login2POM.clickPassword4();
		login2POM.clickPassword5();
		login2POM.clickPassword6();
		login2POM.clickLoginBtn(); 
		login2POM.clickAccount();
		login2POM.clickAccountInfo();
		login2POM.paymentclk();
		login2POM.clkadvance();
		login2POM.sendmemberLogin(Member_Login);
		login2POM.sendmemberName(Member_Login);
		login2POM.sendFromDate("13/02/2020");
		login2POM.sendToDate("14/02/2020");
		login2POM.sendDescription(Description);
		login2POM.clkSerachbtn();


	}

}
