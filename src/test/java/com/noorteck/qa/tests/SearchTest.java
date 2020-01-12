package com.noorteck.qa.tests;

import org.testng.annotations.Test;

import com.noorteck.qa.pages.SearchFuncGoog;
import com.noorteck.qa.utilities.GoogleFunc;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class SearchTest extends GoogleFunc {

	@BeforeMethod
	public void beforeMethod() {
		setUp();
	}

	@Test
	public void f() {

		SearchFuncGoog s = new SearchFuncGoog(driver);
		s.enterSearch("lexus es 350 2019");
		s.clickSr();
		s.clickIm();
		s.page();
		s.forbes();
	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		tearDown();
	}

}
