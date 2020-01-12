package com.noorteck.qa.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFunc {

	public static WebDriver driver;

	public void setUp() {

		String browswrName = "webdriver.chrome.driver";
		String browserPath = "/Users/iuliapopusoi/Desktop/Selenium Jar Files/chromedriver";

		System.setProperty(browswrName, browserPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();

	}

}
