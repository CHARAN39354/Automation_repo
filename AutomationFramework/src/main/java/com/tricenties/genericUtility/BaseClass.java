package com.tricenties.genericUtility;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tricenties.objectRepository.HomePage;
import com.tricenties.objectRepository.LoginPage;
import com.tricenties.objectRepository.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	public static ExtentReports extReport;//declare
	public FileUtility fUtil=new FileUtility();
	public WelcomePage wp;
	public LoginPage lp;
	public HomePage hp;

	public JavaUtility jUtil= new JavaUtility();
	public WebDriverUtility Wutil=new WebDriverUtility();
	
	@BeforeSuite
	public void configReport() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./Html_Reports/ExtentReports_"+ jUtil.getSystemTime() + ".html");
		extReport =new ExtentReports();//initialize
		extReport.attachReporter(spark);
	}
	@BeforeClass
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		Wutil.maximize(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(fUtil.getDataFromProperty("url"));
	}
	@BeforeMethod
	public void login() throws IOException {
		wp=new WelcomePage(driver);
		wp.getLoginLink().click();
		
		lp=new LoginPage(driver);
		lp.getEmaillink().sendKeys(fUtil.getDataFromProperty("email"));
		lp.getPasswordlink().sendKeys(fUtil.getDataFromProperty("password"));
		
	}
	@AfterMethod
	public void closeBrower() {
		hp=new HomePage(driver);
		driver.quit();
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	@AfterSuite
	public void reportBackup() {
		extReport.flush();
	}
}
