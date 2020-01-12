//package com.noorteck.qa.steps;
//
//import com.noorteck.qa.utilities.BaseClass;
//import com.noorteck.qa.utilities.ReadProp;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class Login extends BaseClass {
//
//	@Given("^User is on Free CRM Login Page$")
//	public void loginPage() {
//		prop = ReadProp.getProperties(envirementData);
//		openBrowser();
//		navigate(prop.getProperty("url"));
//		initializedClassObj();
//	}
//
//	@When("^title of login page is Cogmento CRM$")
//	public void getLogTitle() {
//		System.out.println("Title: " + driver.getTitle());
//	}
//
//	@When("^User enters valid username and password$")
//	public void enterCredentials() {
//		loginObj.enterEmail(prop.getProperty("userName"));
//		loginObj.enterPassword(prop.getProperty("password"));
//	}
//
//	@When("^User clicks on login button$")
//	public void clickLogin() {
//		loginObj.clickLogin();
//	}
//
//	@Then("^User is on home page$")
//	public void landHome() {
//		System.out.println("Land Home Page");
//		System.out.println(homeObj.getTextValue());
//	}
//
//	@When("^User enters valid username \"([^\"]*)\" and password \"([^\"]*)\"$")
//	public void user_enters_valid_username_and_password(String username, String password) {
//		System.out.println("UserName: " + username);
//		System.out.println("Password: " + password);
//		loginObj.enterEmail(username);
//		loginObj.enterPassword(password);
//	}
//
//	@Then("^close browser$")
//	public void close_browser() throws InterruptedException {
//		tearDown();
//
//	}
//}
