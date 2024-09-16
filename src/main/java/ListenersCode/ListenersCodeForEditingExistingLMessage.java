package ListenersCode;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import BaseClassUtility.BaseClass;

public class ListenersCodeForEditingExistingLMessage extends BaseClass implements ITestListener 
{
	
	public ExtentSparkReporter spark;
	
	public ExtentReports report;
	
	public ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		
		test = report.createTest(name);
		
		test.log(Status.PASS, name+" is Passed");
	
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		
		test.log(Status.PASS, name+" is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		
		test.log(Status.FAIL, name+" is Failed");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		String from = ts.getScreenshotAs(OutputType.BASE64);
		
		test.addScreenCaptureFromBase64String(from);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		String name = result.getMethod().getMethodName();
		
		System.out.println("onTestSkipped");
		
		test.log(Status.SKIP, name+" is Skipped");
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("onTestFailedWithTimeout");
	}

	@Override
	public void onStart(ITestContext context) 
	{
		File path = new File("C:\\Users\\hp\\automation_testing\\com.crm.pric\\ExtentReport\\EditingAnExistinglockedMessage.html");
		
		spark = new ExtentSparkReporter(path);
		
		spark.config().setDocumentTitle("Editing An Existing locked Message");
		
		spark.config().setReportName("Sandesh Sanas");
		
		spark.config().setTheme(Theme.DARK);
		
		report = new ExtentReports();
		
		report.setSystemInfo("Os", "Window-11");
		
		report.setSystemInfo("Browser", "Chrome");
		
		report.attachReporter(spark);
		
		System.out.println("onStart");
	}

	@Override
	public void onFinish(ITestContext context) 
	{
		System.out.println("onFinish");
		
		report.flush();
	}
	
}
