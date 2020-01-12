package com.noorteck.qa.steps;

import org.testng.Assert;

import com.noorteck.qa.utilities.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tasks extends BaseClass {

	@When("^User navigates to tasks page$")
	public void navigatesTasksPage() {
		taskObj.clickTaskLink();
	}

	@When("^User clicks New$")
	public void clicksNew() {
		taskObj.clickNew();
	}

	@When("^User saves the task$")
	public void userSaves() {
		taskObj.saveButton();
	}

	@Then("^it should display error \"([^\"]*)\"$")
	public void displayError(String expValue) {
		String actualVal = taskObj.checkText();
		Assert.assertEquals(actualVal, expValue);
		System.out.println("Text: " + actualVal);
	}

	@When("^User enters task title \"([^\"]*)\"$")
	public void taskTitle(String enterTitle) {
		taskObj.titleEnter(enterTitle);
		// String actTitle = driver.getTitle();
//		Assert.assertEquals();
	}

	@Then("^the title of task should be displayed \"([^\"]*)\"$")
	public void titleDisplayed(String expTitle) {
		String actTitle = taskObj.tasksTitle();
		Assert.assertEquals(actTitle, expTitle);
		System.out.println("Title: " + expTitle);
	}

}
