package com.tricenties.genericUtility;



import java.io.File;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {
	public void mouseover(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();//mouseover
	}
	public void rightclick(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.contextClick(element).perform();
	}
	public void rightclick(WebDriver driver) {
		Actions act=new Actions(driver);
		act.contextClick().perform();//rightclick
	}
	public void scroll(WebDriver driver,int x,int y) {
		Actions act=new Actions(driver);
		act.scrollByAmount(x, y).perform();//scroll
	}
	public void scroll(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element).perform();//scroll
	}
	public void dragAndDrop(WebDriver driver,WebElement src,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();//drag and drop
	}
	public void selectDropdownbyIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void selectDropDownByValue(WebElement element,String value) {
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void selectDropDownByVisibileText(WebElement element,String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public void switchToFrame(WebDriver driver,int index) {
		driver.switchTo().frame(index);
	}
	public void switchToFrame(WebDriver driver,String nameorId) {
		driver.switchTo().frame(nameorId);
	}
	public void switchToFrame(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchBackToWindow(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void screenShot(WebDriver driver) throws IOException  {
		JavaUtility jutil=new JavaUtility();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./ScreenShot/"+jutil.getSystemTime()+".png");
		FileHandler.copy(temp, dest);
	}
	public void maximize(WebDriver driver) {
		driver.manage().window().maximize();
	}
	public Alert switchToAlert(WebDriver driver) {
		return driver.switchTo().alert();
	}
	public void switchToAlertAndAccept (WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchToWindow(WebDriver driver,String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if(actUrl.contains(expUrl)) {
				break;
			}
	}
}
}