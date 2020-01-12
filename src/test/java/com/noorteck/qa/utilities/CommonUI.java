package com.noorteck.qa.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CommonUI extends GlobVar {

	public static void openBrowser() {

		String openBrowser = prop.getProperty("browserType");

		try {
			if (openBrowser.equalsIgnoreCase("chrome")) {
				System.setProperty(prop.getProperty("chromeName"), prop.getProperty("chromePath"));

				driver = new ChromeDriver();

			} else if (openBrowser.equalsIgnoreCase("ff")) {
				System.setProperty(prop.getProperty("FFName"), prop.getProperty("FFPath"));

				driver = new FirefoxDriver();

			} else if (openBrowser.equalsIgnoreCase("ie")) {
				System.setProperty(prop.getProperty("IEName"), prop.getProperty("IEPath"));

				driver = new InternetExplorerDriver();

			} else {

				Assert.fail("Unable To Find The Browser");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable To Find The Browser");

		}
	}

	public static void navigate(String nav) {
		driver.manage().timeouts().implicitlyWait(implisitWait, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));

	}

	public static void quitBrowser() {
		try {
			Thread.sleep(3000);
			driver.quit();
		} catch (Exception e) {
			System.out.println("Driver Browser not Exist: " + e);
			e.printStackTrace();
		}
	}

	public static boolean isDisplayed(WebElement element) {
		boolean isDisplayed = false;
		try {
			if (element.isDisplayed()) {
				isDisplayed = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue(false, "WebElement Not Find " + e);
		}
		return isDisplayed;
	}

	public static void click(WebElement element) {
		if (isDisplayed(element)) {
			element.click();
		} else {
			Assert.assertTrue(false, "WebElement Not Clickabel " + element);
		}
	}

	public static void enter(WebElement element, String value) {
		try {

			element.sendKeys(value);

		} catch (Exception e) {
			System.out.println("WebElement Not Found " + e);
			e.printStackTrace();
		}
	}

	public static void clear(WebElement element) {
		try {
			element.clear();

		} catch (Exception e) {
			System.out.println("WebElement Not Found " + e);
			e.printStackTrace();
		}
	}

	public static void clearAndEnter(WebElement element, String value) {

		clear(element);
		enter(element, value);

	}

	public static String getTextValue(WebElement element) {
		String textValue = null;
		try {
			textValue = element.getText();
		} catch (Exception e) {
			System.out.println("WebElement Not Found " + e);
			e.printStackTrace();
		}
		return textValue;

	}

	public static String getTitle() {
		String titleStr = null;
		try {
			titleStr = getTitle();
		} catch (Exception e) {
			System.out.println("WebElement Not Found " + e);
			e.printStackTrace();
		}
		return titleStr;

	}

	public static void dropDownByIndex(WebElement element, int index) {

		try {
			Select dropdown = new Select(element);
			dropdown.selectByIndex(index);
		} catch (Exception e) {
			System.out.println("WebElement Not Found " + e);
			e.printStackTrace();

		}
	}

	public static void dropDownByValue(WebElement element, String value) {

		try {
			Select dropdown = new Select(element);
			dropdown.deselectByValue(value);
		} catch (Exception e) {
			System.out.println("WebElement Not Found " + e);
			e.printStackTrace();

		}
	}

	public static void dropDownByText(WebElement element, String text) {

		try {
			Select dropdown = new Select(element);
			dropdown.deselectByVisibleText(text);
		} catch (Exception e) {
			System.out.println("WebElement Not Found " + e);
			e.printStackTrace();

		}
	}

	public static void enterWithKey(WebElement element, String value) {
		try {
			element.sendKeys(value + Keys.ENTER);
		} catch (Exception e) {
			System.out.println("WebElement not found " + e);
			e.printStackTrace();
		}

	}

	public static boolean isAlertPresent() {
		boolean isAlert = false;

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			if (wait.until(ExpectedConditions.alertIsPresent()) != null) {
				isAlert = true;
			}
		} catch (UnhandledAlertException e) {
			System.out.println("Alert is not handled " + e);
			e.printStackTrace();
		}
		return isAlert;
	}

	public static void alertAccept() {
		if (isAlertPresent()) {
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
		}
	}

	public static void alertDecline() {
		if (isAlertPresent()) {
			driver.switchTo().alert().dismiss();
			driver.switchTo().defaultContent();
		}
	}

	public static void selectCheckBox(WebElement element) {

		try {
			if (!element.isSelected()) {
				element.click();
			} else {
				System.out.println("Element already Selectected ");
			}
		} catch (Exception e) {
			System.out.println("WebElement not found " + e);
			e.printStackTrace();
		}
	}

}
