package com.noorteck.qa.steps;

import java.util.List;
import java.util.Map;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FormsStepDef extends BaseClass {

	@When("^User navigates to Form page$")
	public void navigateForm() {
		formsTempObj.clickForm();
		;
	}

	@When("^User clicks new$")
	public void clicksNew() {
		formsTempObj.clickNew();
		;
	}

	@When("^User enters form data$")
	public void entersata(DataTable dataTable) {
		// Convert Data Table to List Map
		List<Map<String, String>> ListMap = dataTable.asMaps(String.class, String.class);

		// Convert List Map to a Map
		for (Map<String, String> map : ListMap) {
			formsTempObj.enterName(map.get("name"));
			formsTempObj.introductionTextField(map.get("introductionText"));
			formsTempObj.completionTextField(map.get("completionText"));

		}

	}

	@Then("^User saves the form$")
	public void saveForm() {
		formsTempObj.clickSave();
		;
	}

}
