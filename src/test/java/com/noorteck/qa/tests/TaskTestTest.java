package com.noorteck.qa.tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.noorteck.qa.pages.TaskPage;
import com.noorteck.qa.pages.Login;
import com.noorteck.qa.utilities.BaseClass;

public class TaskTestTest extends BaseClass {

	TaskPage p;

	@Test
	public void test1() throws InterruptedException {

		Thread.sleep(1000);

		p = new TaskPage();
		p.clickTaskLink();
		Thread.sleep(1000);
		p.header();
	}

	@Test
	public void test2() throws InterruptedException {

		Thread.sleep(1000);

		p = new TaskPage();
		p.clickTaskLink();
		Thread.sleep(1000);
		p.clickNew();
		Thread.sleep(1000);
		p.titleEnter("Vlad");
		Thread.sleep(1000);
		p.dropDown();
		Thread.sleep(1000);
		p.dropSelect();
		Thread.sleep(1000);
		p.date();
		Thread.sleep(1000);
		p.deal();
		Thread.sleep(1000);
		p.date2();
		Thread.sleep(1000);
		p.desciprion();
		Thread.sleep(1000);
		p.completion();
		Thread.sleep(1000);
		p.drop2();
		Thread.sleep(1000);
		p.dropSelect2();
		Thread.sleep(1000);
		p.type();
		Thread.sleep(1000);
		p.typeSelect();
		Thread.sleep(1000);
		p.contact();
		Thread.sleep(1000);
		p.caseField();
		Thread.sleep(1000);
		p.tags();
		Thread.sleep(1000);
		p.priority();
		Thread.sleep(1000);
		p.prioritySelect();
		Thread.sleep(1000);
		p.identifier();
		Thread.sleep(1000);
		p.saveButton();
		Thread.sleep(1000);
		p.checkText();
		p.tasksTitle();
	}

	@Test
	public void test3() throws InterruptedException {

		Thread.sleep(1000);

		p = new TaskPage();
		p.clickTaskLink();
		Thread.sleep(1000);
		p.checkBox();
		Thread.sleep(1000);
		p.clickBin();
		Thread.sleep(1000);
		p.clickDelete();
	}
}
