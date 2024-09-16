package BaseClassUtility;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PomUtility.PageElement;

public class BaseClass 
{
	public WebDriver driver;
	
	String url;
	String mobNo;

	@BeforeSuite
	public void beforeSuite()
	{
		
	}
	
	@BeforeTest
	public void beforeTest() throws IOException
	{
		url = ExternalFileUtility.PropertyFile.propertiesRead("url");
		
		mobNo = ExternalFileUtility.PropertyFile.propertiesRead("mobNo");

	}
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to(url);
		
		Thread.sleep(2000);
	}
	
	@BeforeMethod
	public void beforeMethod() throws InterruptedException
	{	
		PageElement el = new PageElement(driver);
		
		el.mobNo.sendKeys(mobNo);
		
		Scanner sc = new Scanner(System.in);
		
		el.sendOtp.click();
		
		Reporter.log("enter first",true);
		
		el.otpButton1.sendKeys(""+sc.nextInt());
		 
		Reporter.log("enter second",true);
		 
		el.otpButton2.sendKeys(""+sc.nextInt());
		  
		Reporter.log("enter third",true);
		 
		el.otpButton3.sendKeys(""+sc.nextInt());
		 
		Reporter.log("enter fourth",true);
		
		el.otpButton4.sendKeys(""+sc.nextInt());
		
		Thread.sleep(2000);
		
		el.verifyOtp.click();
	}
	

	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		PageElement el = new PageElement(driver);
		
		Thread.sleep(3000);
		
		el.home.click();
		
		Thread.sleep(10000);
		
		Actions at = new Actions(driver);
		
	    at.moveByOffset(80, 520);
	    
		at.keyDown(Keys.PAGE_DOWN);
		
		at.keyDown(Keys.PAGE_DOWN);
		
		at.build().perform();

		Thread.sleep(4000);
	
		el.signOut.click();
				
		el.signOut2.click();
		
	}
	
	@AfterClass
	public void afterClass() throws InterruptedException
	{
		Thread.sleep(2000);
		
		driver.close();
	}
	
	@AfterTest
	public void afterTest()
	{
		
	}
	
	@AfterSuite
	public void afterSuite()
	{
		
	}
}
