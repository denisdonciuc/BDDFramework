package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utilities.BaseClass;

public class FormsTemp extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'Forms')]")
	WebElement formButt;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement newButt;

	@FindBy(xpath = "//input[@name='name']")
	WebElement nameField;

	@FindBy(xpath = "//textarea[@name='intro']")
	WebElement introductionTextField;

	@FindBy(xpath = "//textarea[@name='outro']")
	WebElement completionTextField;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveButt;

	@FindBy(xpath = "//tr[1]//td[1]")
	WebElement checkBox;

	@FindBy(xpath = "//tr[1]//td[6]//div[1]//button[1]//i[1]")
	WebElement deleteButt;

	@FindBy(xpath = "//button[@class='ui button']")
	WebElement confirmButt;

	public FormsTemp() {
		PageFactory.initElements(driver, this);

	}

	public void clickForm() {
		click(formButt);
	}

	public void clickNew() {
		click(newButt);
	}

	public void enterName(String value) {
		enter(nameField, value);
	}

	public void introductionTextField(String value) {
		enter(introductionTextField, value);
	}

	public void completionTextField(String value) {
		enter(completionTextField, value);
	}

	public void clickSave() {
		click(saveButt);
	}

	public void clickCheckBox() {
		click(checkBox);
	}

	public void clickDelete() {
		click(deleteButt);
	}

	public void clickConfirm() {
		click(confirmButt);
	}
}
