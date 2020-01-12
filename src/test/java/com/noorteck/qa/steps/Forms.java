package com.noorteck.qa.steps;

import java.util.List;
import java.util.Map;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Forms extends BaseClass {

	@When("^User navigates to forms page$")
	public void navigatesForms() {
		formsTempObj.clickForm();
	}

	@When("^User click delete icon$")
	public void clickDeleteIcon() {
		formsTempObj.clickDelete();
	}

	@When("^User clicks delete button$")
	public void clicksDeleteButton() {
		formsTempObj.clickConfirm();
	}

	@Then("^User should be directed to Forms page$")
	public void directedForms() {
		System.out.println("At Forms Page");
	}

	@When("^User enters name \"([^\"]*)\"$")
	public void entersName(String name) {
		formsTempObj.enterName(name);
	}

	@When("^User enters introduction text \"([^\"]*)\"$")
	public void introductionText(String intro) {
		formsTempObj.introductionTextField(intro);
	}

	@When("^User enters completion text \"([^\"]*)\"$")
	public void completionText(String comp) {
		formsTempObj.completionTextField(comp);
	}

	@When("^User clicks save$")
	public void clicksSave() {
		formsTempObj.clickSave();
	}

	@Then("^User should be directed to Active page$")
	public void directedActive() {
		System.out.println("Active Page");
	}

	@When("^User enters form field data$")
	public void entersFormField(DataTable dataTable) {

		List<Map<String, String>> ListMap = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> map : ListMap) {
			formsTempObj.enterName(map.get("name"));
			formsTempObj.introductionTextField(map.get("introductionText"));
			formsTempObj.completionTextField(map.get("completionText"));

		}
	}

	@When("^User enters  form data$")
	public void entersFormData(DataTable dataTable) {

		List<Map<String, String>> ListMap = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> map : ListMap) {
			formsTempObj.enterName(map.get("name"));
			formsTempObj.introductionTextField(map.get("introductionText"));
			formsTempObj.completionTextField(map.get("completionText"));

		}

	}

	@When("^User enters form field data \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void entersFormFieldData(String name, String introductionText, String completionText) {
		formsTempObj.enterName(name);
		formsTempObj.introductionTextField(introductionText);
		formsTempObj.completionTextField(completionText);

	}

	@When("^User enters form field data values$")
	public void entersFormDataAdd(DataTable dataTable) {

		List<Map<String, String>> ListMap = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> map : ListMap) {
			formsTempObj.enterName(map.get("name"));
			formsTempObj.introductionTextField(map.get("introductionText"));
			formsTempObj.completionTextField(map.get("completionText"));
		}

	}
}
