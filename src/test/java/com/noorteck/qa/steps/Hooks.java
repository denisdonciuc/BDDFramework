package com.noorteck.qa.steps;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Hooks extends BaseClass {

	@Before
	public void beforeTest(Scenario scenario) {
		setUp();
		System.out.println("Test Enviroment Set Up");
		System.out.println("Executing Scenario: " + scenario.getName());

	}

	@After
	public void afterTest(Scenario scenario) throws InterruptedException {
		System.out.println("Finishing Executing Scenario: " + scenario.getName());
		tearDown();

	}

	@Given("^User is logged in and in CRM Home page$")
	public void login() {
		loginObj.enterEmail(prop.getProperty("userName"));
		loginObj.enterPassword(prop.getProperty("password"));
		loginObj.clickLogin();
		//aa
		//bb
		
		//ccc
	}
}
