package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utilities.BaseClass;

public class Login extends BaseClass {

	@FindBy(name = "email")
	WebElement emailField;

	@FindBy(name = "password")
	WebElement passwordlField;

	@FindBy(css = ".blue.button.fluid")
	WebElement loginButton;

	public Login() {
		PageFactory.initElements(driver, this);

	}

	public void enterEmail(String email) {
		enter(emailField, email);

	}

	public void enterPassword(String password) {
		enter(passwordlField, password);
	}

	public void clickLogin() {
		click(loginButton);

	}

}
