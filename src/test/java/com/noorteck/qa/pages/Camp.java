package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utilities.BaseClass;

public class Camp extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'Campaigns')] ")
	WebElement compaingsButton;

	@FindBy(xpath = "//button[contains(text(),'Templates')]")
	WebElement templatesButton;

	@FindBy(xpath = "//button[@class='ui button']")
	WebElement newButton;

	@FindBy(xpath = "//input[@name='name']")
	WebElement nameField;

	@FindBy(xpath = "//input[@name='subject']")
	WebElement subjectField;

	@FindBy(xpath = "//div[@name='attachments']")
	WebElement attachmentsField;

	@FindBy(xpath = "//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr']")
	WebElement bodyField;

	@FindBy(xpath = "//div[@name='type']")
	WebElement templateType;

	@FindBy(xpath = "//span[@class='text'][contains(text(),'Email')]")
	WebElement emailSelect;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='visible menu transition']//div[@class='item']")
	WebElement phoneSelect;

	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement header;

	@FindBy(xpath = "//div[@name='type']")
	WebElement fieldSelect;

	@FindBy(xpath = "//span[@class='text'][contains(text(),'Email')]")
	WebElement selecyEmail;

	@FindBy(xpath = "//span[contains(text(),'SMS')]")
	WebElement selectSms;

	@FindBy(xpath = "//*[@id=\"ui\"]/div/div[2]/div[2]/div/div[2]/table/tbody/tr[1]/td[4]/button")
	WebElement iconDelete;

	@FindBy(xpath = "//button[text()='Delete']")
	WebElement confirmDelete;

	@FindBy(xpath = "//i[@class='close icon']")
	WebElement clickXclose;

	public Camp() {
		PageFactory.initElements(driver, this);

	}

	public void compaingsButton() {
		click(compaingsButton);
	}

	public void templatesButton() {
		click(templatesButton);
	}

	public void newButton() {
		click(newButton);
	}

	public void nameField(String value) {
		enterWithKey(nameField, value);
	}

	public void subjectField(String value) {
		enterWithKey(subjectField, value);
	}

	public void attachmentsField(String value) {
		enterWithKey(attachmentsField, value);
	}

	public void bodyField(String value) {
		enterWithKey(bodyField, value);
	}

	public void templateType() {
		click(templateType);
	}

	public void emailSelect() {
		click(emailSelect);
	}

	public void saveButton() {
		click(saveButton);
	}

	public void phoneSelect() {
		click(phoneSelect);
	}

	public String header() {
		return getTextValue(header);
	}

	public void fieldSelect() {
		click(fieldSelect);
	}
	
	public void selecyEmail() {
		click(selecyEmail);
	}

	public void selectSms() {
		click(selectSms);
	}

	public void iconDelete() {
		click(iconDelete);
	}

	public void confirmDelete() {
		click(confirmDelete);
	}

	public void clickXclose() {
		click(clickXclose);
	}
}
