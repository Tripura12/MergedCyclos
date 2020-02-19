package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.generics.ScreenShot;
import com.training.pom.RoLoginComplexPOM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RoLoginComplexTests {
	private WebDriver driver;
	private String baseUrl;
	private  RoLoginComplexPOM loginComplexPOM;
	//private TestMemPOM testmemPOM;
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
		loginComplexPOM=new RoLoginComplexPOM(driver);
		baseUrl = properties.getProperty("baseURL");
		screenShot = new ScreenShot(driver); 
		// open the browser 
		driver.get(baseUrl);
	}
	@AfterMethod
	public void tearDown() throws Exception {
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
		//driver.quit();
	}
	@Test (priority=0)
	public void validLoginTest() throws InterruptedException {
		
		loginComplexPOM.sendUserName("rohit1");
		loginComplexPOM.password1();
		loginComplexPOM.password2();
		loginComplexPOM.password3();
		loginComplexPOM.password4();
		loginComplexPOM.clickLoginBtn(); 
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
	}
	
 
	@Test (priority=1)
	public void memInput()throws InterruptedException{
		loginComplexPOM.accountLink();
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
		loginComplexPOM.mempayment();
		driver.manage().timeouts().implicitlyWait(60000,TimeUnit.SECONDS);
		loginComplexPOM.loginName();
		Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(600000,TimeUnit.SECONDS);
		loginComplexPOM.amount1();
		loginComplexPOM.description();
		loginComplexPOM.submit1();
		loginComplexPOM.submit2();
		loginComplexPOM.logout();
		 Alert alert = driver.switchTo().alert();
		 alert.accept();
	}
	
	@Test (priority=2)
	public void reLogin(){
		loginComplexPOM.sendUserName("rohit1");
		loginComplexPOM.password1();
		loginComplexPOM.password2();
		loginComplexPOM.password3();
		loginComplexPOM.password4();
		loginComplexPOM.clickLoginBtn(); 
	}
	
	
	@Test (priority=3)
	public void check() throws InterruptedException{
		loginComplexPOM.accountLink();
		driver.manage().timeouts().implicitlyWait(30000,TimeUnit.SECONDS);
		loginComplexPOM.accInfo();
		loginComplexPOM.select();
		loginComplexPOM.view();
		loginComplexPOM.backButton();
	}
	
	
}