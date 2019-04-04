package com.flipkart.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.flipkart.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR:
		@FindBy(linkText="Login & Signup")
		WebElement loginButton;

}
