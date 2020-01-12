package com.noorteck.qa.utilities;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.noorteck.qa.pages.Camp;
import com.noorteck.qa.pages.CampaingsPage;
import com.noorteck.qa.pages.FormsTemp;
import com.noorteck.qa.pages.HomePage;
import com.noorteck.qa.pages.Login;
import com.noorteck.qa.pages.TaskPage;

public class BaseClass extends CommonUI {

	@BeforeMethod
	public void setUp() {
		prop = ReadProp.getProperties(envirementData);
		openBrowser();
		navigate(prop.getProperty("url"));
		initializedClassObj();
//		loginObj.enterEmail(prop.getProperty("userName"));
//		loginObj.enterPassword(prop.getProperty("password"));
//		loginObj.clickLogin();

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		quitBrowser();

	}

	public void initializedClassObj() {
		loginObj = new Login();
		taskObj = new TaskPage();
		homeObj = new HomePage();
		formsTempObj = new FormsTemp();
		campObj = new Camp();
		homePageObj = new HomePage();
		
	}
}
