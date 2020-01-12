package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.noorteck.qa.utilities.BaseClass;

public class TaskPage extends BaseClass {

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement task;

	@FindBy(xpath = "//button[contains(text(),'New')]")
	WebElement newField;

	@FindBy(xpath = "//input[@name='title']")
	WebElement title;

	@FindBy(xpath = "//div[@class='ui fluid selection dropdown']")
	WebElement drop;

	@FindBy(xpath = "//div[@class='visible menu transition']//span[@class='text'][contains(text(),'fahim noor')]")
	WebElement dropSelect;

	@FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//div[1]//input[1]")
	WebElement date;

	@FindBy(xpath = "//div[@name='deal']//input[@class='search']")
	WebElement deal;

	@FindBy(xpath = "//div[5]//div[1]//div[1]//div[1]//div[1]//input[1]")
	WebElement date2;

	@FindBy(xpath = "//textarea[@name='description']")
	WebElement desciprion;

	@FindBy(xpath = "//input[@name='completion']")
	WebElement completion;

	@FindBy(xpath = "//div[@name='status']")
	WebElement drop2;

	@FindBy(xpath = "//span[contains(text(),'Enquiring')]")
	WebElement dropSelect2;

	@FindBy(xpath = "//div[@name='type']")
	WebElement type;

	@FindBy(xpath = "//span[contains(text(),'Technical Support')]")
	WebElement typeSelect;

	@FindBy(xpath = "dropDownByIndex(drop2, 0);")
	WebElement contact;

	@FindBy(xpath = "//div[@name='case']//input[@class='search']")
	WebElement caseField;

	@FindBy(xpath = "//div[@class='ui fluid multiple search selection dropdown']")
	WebElement tags;

	@FindBy(xpath = "//div[@name='priority']")
	WebElement priority;

	@FindBy(xpath = "//div[@class='visible menu transition']//div[2]")
	WebElement prioritySelect;

	@FindBy(xpath = "//input[@name='identifier']")
	WebElement identifier;

	@FindBy(xpath = "//button[@class='ui linkedin button']")
	WebElement saveButton;

	@FindBy(xpath = "//div[@class='ui header item mb5 light-black']")
	WebElement header;

	@FindBy(xpath = "//tr[1]//td[1]")
	WebElement checkBox;

	@FindBy(xpath = "//tr[1]//td[7]//div[1]//button[1]")
	WebElement clickBin;

	@FindBy(xpath = "//button[@class='ui button']")
	WebElement clickDelete;

	@FindBy(xpath = "//p[contains(text(),'The field Title is required')]")
	WebElement checkText;

	@FindBy(xpath = "//p[contains(text(),'axezwcaew')]")
	WebElement tasksTitle;

	public TaskPage() {
		PageFactory.initElements(driver, this);

	}

	public void clickTaskLink() {
		click(task);
	}

	public void clickNew() {
		click(newField);
	}

	public void titleEnter(String value) {
		enterWithKey(title, value);
	}

	public void dropDown() {
		click(drop);
	}

	public void dropSelect() {
		click(dropSelect);
	}

	public void date() {
		enterWithKey(date, "31/12/2019 10:00");
	}

	public void deal() {
		enterWithKey(deal, "Lexus");
	}

	public void date2() {
		enterWithKey(date2, "31/12/2019 10:00");
	}

	public void desciprion() {
		enterWithKey(desciprion, "Fahim Too Many Lunch Of Code");
	}

	public void completion() {
		enterWithKey(completion, "$$$");
	}

	public void drop2() {
		click(drop2);
	}

	public void dropSelect2() {
		click(dropSelect2);
	}

	public void type() {
		click(type);
	}

	public void typeSelect() {
		click(typeSelect);
	}

	public void contact() {
		enterWithKey(contact, "Fahim");
	}

	public void caseField() {
		enterWithKey(caseField, "#1");
	}

	public void tags() {
		enterWithKey(tags, "NoorTeck");
	}

	public void priority() {
		click(priority);
	}

	public void prioritySelect() {
		click(prioritySelect);
	}

	public void identifier() {
		enterWithKey(identifier, "Denis");
	}

	public void header() {
		String exp = "Tasks";
		Assert.assertEquals(exp, header.getText());
		System.out.println("Header: " + header.getText());
	}

	public void saveButton() {
		click(saveButton);
	}

	public void checkBox() {
		click(checkBox);
	}

	public void clickBin() {
		click(clickBin);
	}

	public void clickDelete() {
		click(clickDelete);
	}

	public String checkText() {
		return getTextValue(checkText);
	}

	public String tasksTitle() {
		return getTextValue(tasksTitle);
	}

}
