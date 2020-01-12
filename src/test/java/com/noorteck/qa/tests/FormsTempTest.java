package com.noorteck.qa.tests;

import org.testng.annotations.Test;

import com.noorteck.qa.pages.FormsTemp;
import com.noorteck.qa.pages.TaskPage;
import com.noorteck.qa.utilities.BaseClass;

public class FormsTempTest extends BaseClass {

	@Test
	public void TestForm() {

		formsTempObj.clickForm();
		formsTempObj.clickNew();
		formsTempObj.enterName("Fahim");
		formsTempObj.introductionTextField("Aruba");
		formsTempObj.completionTextField("Waikiki");
		formsTempObj.clickSave();

	}

	@Test
	public void TestDelete() throws InterruptedException {

		formsTempObj.clickForm();
		formsTempObj.clickCheckBox();
		Thread.sleep(2000);
		formsTempObj.clickDelete();
		formsTempObj.clickConfirm();

	}
}
