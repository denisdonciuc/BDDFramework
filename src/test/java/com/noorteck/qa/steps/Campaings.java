package com.noorteck.qa.steps;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Campaings extends BaseClass {

	@When("^User navigates to campaings page$")
	public void navigateToPage() {
		campObj.compaingsButton();
		;
	}

	@When("^User clicks template$")
	public void clickTaplete() {
		campObj.templatesButton();
		;
	}

	@When("^User clicks new content template$")
	public void clickContent() {
		campObj.newButton();
		;
	}

	@When("^User enters name, subject, body in the field \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void enterEmailData(String name, String subject, String body) {
		campObj.nameField(name);
		campObj.subjectField(subject);
		campObj.bodyField(body);

	}

	@When("^User clicks save button$")
	public void clickSave() {
		campObj.saveButton();
	}

	@Then("^User should be directed to the Content Templates Page$")
	public void isContentTempPage() {
		System.out.println("User in in Content Templete Page");
	}

}
