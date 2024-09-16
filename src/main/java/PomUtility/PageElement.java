package PomUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageElement 
{
	public PageElement(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	public @FindBy(xpath = "//input[@placeholder='Mobile No.']")
	WebElement mobNo;
	
	public @FindBy(xpath = "//button[text()='Send OTP']")
	WebElement sendOtp;
	
	public @FindBy(xpath = "//button[text()='Verify OTP']")
	WebElement verifyOtp;
	
	public @FindBy(xpath = "(//input[@class='pincode-input-text'][1])")
	WebElement otpButton1;
	
	public@FindBy(xpath = "(//input[@class='pincode-input-text'][2])")
	WebElement otpButton2;
	
	public @FindBy(xpath = "(//input[@class='pincode-input-text'][3])")
	WebElement otpButton3;
	
	public @FindBy(xpath = "(//input[@class='pincode-input-text'][4])")
	WebElement otpButton4;
	
	public @FindBy(xpath = "//span[text()='Sign Out']")
	WebElement signOut;
	
	public @FindBy(xpath = "//button[text()='Sign Out']")
	WebElement signOut2;
	
	public @FindBy(xpath = "(//span[text()='Locked Message'])[1]")
	WebElement lockedMessage;
	
	public @FindBy(xpath = "//span[text()='Home']")
	WebElement home;
	
	public @FindBy(xpath = "//button[text()='Create Locked Message']")
	WebElement createLockedMessage;
	
	public @FindBy(xpath = "//input[@placeholder='Amount']")
	WebElement amount;
	
	public @FindBy(xpath = "//textarea[@name='visibleMessage']")
	WebElement visibleMessage;
	
	public @FindBy(xpath = "//textarea[@placeholder='Premium Content']")
	WebElement premiumContent;
	
	public @FindBy(xpath = "(//button[@class='btn btn-btn btn-outline-primary'])[1]")
	WebElement audio;
	
	public @FindBy(xpath = "(//button[@class='btn btn-btn btn-outline-primary'])[2]")
	WebElement video;
	
	public @FindBy(xpath = "(//button[@class='btn btn-btn btn-outline-primary'])[3]")
	WebElement image;
	
	public @FindBy(xpath = "(//button[@class='btn btn-btn btn-outline-primary'])[4]")
	WebElement doc;
	
	public @FindBy(xpath = "(//input[@class='form-check-input'])[1]")
	WebElement activeLimitedTimeOffer;
	
	public @FindBy(xpath = "(//input[@class='form-check-input'])[2]")
	WebElement expireMessage;
	
	public @FindBy(xpath = "(//input[@class='form-check-input'])[3]")
	WebElement customPrice;
	
	public @FindBy(id = "bigButton")
	WebElement submit;
	
	public @FindBy(xpath = "//input[@placeholder='Search...']")
	WebElement searchBar;
	
	public @FindBy(xpath = "(//button[@class='btn btn-gradient-primary'])[1]")
	WebElement searchButton;
	
	public @FindBy(xpath = "//a[@class='text-primary text-decoration-underline']")
	WebElement productPrice;
	
	public @FindBy(xpath = "//i[@class='fe fe-edit']")
	WebElement edit;
	
	public @FindBy(xpath = "(//i[@class='fe fe-trash'])[1]")
	WebElement delete;
	
	public @FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement delete2;
	
	public @FindBy(xpath = "//table[@role='table']")
	WebElement lockedViewListTable;
	

}
