//package com.noorteck.qa.steps;
//
//import com.noorteck.qa.utilities.BaseClass;
//import com.noorteck.qa.utilities.ReadProp;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class Email extends BaseClass {
//
//	@Given("^User is on Free CRM Page$")
//	public void user_is_on_Free_CRM_Page() {
//		prop = ReadProp.getProperties(envirementData);
//		openBrowser();
//		navigate(prop.getProperty("url"));
//		initializedClassObj();
//		loginObj.enterEmail(prop.getProperty("userName"));
//		loginObj.enterPassword(prop.getProperty("password"));
//		loginObj.clickLogin();
//	}
//
//	@Given("^User clicks on compaings link$")
//	public void compaingsButton() throws InterruptedException {
//		campObj.compaingsButton();
//		Thread.sleep(1000);
//	}
//
//	@Given("^User clicks on Tamplete  Button$")
//	public void templatesButton() throws InterruptedException {
//		campObj.templatesButton();
//		Thread.sleep(1000);
//	}
//
//	@Then("^User clicks  new content templete$")
//	public void newButton() throws InterruptedException {
//		campObj.newButton();
//		Thread.sleep(1000);
//	}
//
//	@Then("^User enters Name \"([^\"]*)\"$")
//	public void userEnterName(String arg1) throws InterruptedException {
//		campObj.nameField("Rajesh");
//		Thread.sleep(1000);
//	}
//
//	@Then("^User enters Subject \"([^\"]*)\"$")
//	public void userEntersSubject(String arg1) throws InterruptedException {
//		campObj.subjectField("Code Reviw");
//		Thread.sleep(1000);
//	}
//
//	@Then("^User enters email body  \"([^\"]*)\"$")
//	public void user_enters_email_body(String arg1) throws InterruptedException  {
//		campObj.templateType();
//		Thread.sleep(1000);
//		campObj.emailSelect();
//		Thread.sleep(1000);
//		campObj.bodyField("Skype meeting");
//		Thread.sleep(1000);
//	}
//
//	@Then("^User clicks  save Button$")
//	public void saveButton() throws InterruptedException {
//		campObj.saveButton();
//		Thread.sleep(1000);
//		tearDown();
//
//	}
//}
