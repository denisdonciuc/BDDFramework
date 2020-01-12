package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utilities.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath = "//span[@class='user-display']")
	WebElement userName;

	public HomePage() {
		PageFactory.initElements(driver, this);

	}

	public String getTextValue() {
		return getTextValue(userName);

	}
}
