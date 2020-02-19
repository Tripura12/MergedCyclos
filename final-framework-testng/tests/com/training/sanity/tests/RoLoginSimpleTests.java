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
import com.training.pom.RoLoginSimplePOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RoLoginSimpleTests {

	private WebDriver driver;
	private String baseUrl;
	private RoLoginSimplePOM loginPOM;
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
		loginPOM = new RoLoginSimplePOM(driver); 
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
	@Test(priority=1)
	public void validLoginTest() throws InterruptedException {
		loginPOM.sendUserName("admin");
		loginPOM.password1();
		loginPOM.password2();
		loginPOM.password3();
		loginPOM.password4();
		loginPOM.clickLoginBtn(); 
		
		//loginPOM.clickLogoutBtn(); 
		
		screenShot.captureScreenShot("First");
	}
	
	 @Test (priority=2)
	  public void create_a_Loans_link() throws InterruptedException {
		 loginPOM.memUserName();
		 Thread.sleep(3000);
		 
	 }
	 
	  @Test (priority=3)
	  public void click_on_View_icon_of_Particular_loan() throws InterruptedException {
		  loginPOM.viewLoan();
			 Thread.sleep(3000);
	  }
	  
	  @Test (priority=4)
	  public void enter_valid_credentials_in_Amount_textbox() throws InterruptedException {
		  loginPOM.view();  
			 Thread.sleep(3000);

		  loginPOM.clear();
		  loginPOM.amount();
			 Thread.sleep(3000);

		  loginPOM.repay();
			 Thread.sleep(3000);

		  Alert alert = driver.switchTo().alert();
		  alert.accept();
			 Thread.sleep(3000);

		  
		  Alert alert1 = driver.switchTo().alert();
		  alert1.accept();
	  }
	  
	  
	  
}	
