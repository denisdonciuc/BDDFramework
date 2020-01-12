package com.noorteck.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchFuncGoog {

	WebDriver driver;

	@FindBy(name = "q")
	WebElement searchField;

	@FindBy(name = "btnK")
	WebElement searchButt;

	@FindBy(css = "#hdtb-msb-vis > div:nth-child(2) > a")
	WebElement imageButt;

	@FindBy(id = "NYKxftg3AaFcaM:")
	WebElement forbes;

	@FindBy(xpath = "//*[@id=\"irc-ss\"]/div[2]/div[2]/div[1]/div/div[2]/a[1]/div/span[2]")
	WebElement clickForbes;

	public SearchFuncGoog(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterSearch(String search) {
		searchField.sendKeys(search);

	}

	public void clickSr() {
		searchButt.click();
	}

	public void clickIm() {
		imageButt.click();
	}

	public void page() {
		forbes.click();
	}

	public void forbes() {
		clickForbes.click();

	}

}
