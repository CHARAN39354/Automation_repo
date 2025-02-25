package com.tricenties.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration
		@FindBy(linkText="Log out")
		private WebElement logoutlink;
		
		@FindBy(partialLinkText = "Book")
		private WebElement bookslink;
		
		@FindBy(partialLinkText = "Computers")
		private WebElement computerlink;
		
		@FindBy(partialLinkText = "Electronics")
		private WebElement electronicslink;
		
		@FindBy(partialLinkText = "Gift Cards")
		private WebElement giftcardslink;
		
		
		//intialization
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		}
		//getters
		public WebElement getLogoutlink() {
			return logoutlink;
		}
		public WebElement getBookslink() {
			return bookslink;
		}
		public WebElement getComputerlink() {
			return computerlink;
		}
		public WebElement getElectronicslink() {
			return electronicslink;
		}
		
		public WebElement getGiftcardslink() {
			return giftcardslink;
		}
		

}
