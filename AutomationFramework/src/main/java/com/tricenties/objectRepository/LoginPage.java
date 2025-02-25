package com.tricenties.objectRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(id="Email")
	private WebElement emaillink;
	
	@FindBy(id="Password")
	private WebElement passwordlink;
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement login;
	
	//intialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	//	getters
	public WebElement getEmaillink() {
		return emaillink;
	}

	public WebElement getPasswordlink() {
		return passwordlink;
	}

	public WebElement getLogin() {
		return login;
	}

}
