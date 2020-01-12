package com.noorteck.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.noorteck.qa.utilities.BaseClass;

public class HomeTest extends BaseClass {

	@Test
	public void titlte() throws InterruptedException {

		String title = "Cogmento CRM";
		Assert.assertEquals(title, driver.getTitle());

		System.out.println("Title: " + driver.getTitle());
	}

	@Test
	public void userName() throws InterruptedException {

		homePageObj.getTextValue();
		Thread.sleep(1000);
		String exp = "fahim noor";
		Assert.assertEquals(exp, homePageObj.getTextValue());

		System.out.println("User: " + homePageObj.getTextValue());

	}

}
