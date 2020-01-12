package com.noorteck.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.noorteck.qa.utilities.BaseClass;

public class CampTest extends BaseClass {

	@Test
	public void pageHeader() throws InterruptedException {

		campObj.compaingsButton();
		Thread.sleep(1000);
		String exp = "Campaigns";
		Assert.assertEquals(exp, campObj.header());

		System.out.println(campObj.header());
	}

	@Test
	public void deleteSMS() throws InterruptedException {

		campObj.compaingsButton();
		Thread.sleep(1000);
		campObj.templatesButton();
		Thread.sleep(1000);
		campObj.fieldSelect();
		Thread.sleep(1000);
		campObj.selectSms();
		Thread.sleep(1000);
		campObj.iconDelete();
		Thread.sleep(1000);
		campObj.confirmDelete();
		Thread.sleep(1000);
		campObj.clickXclose();

	}

	@Ignore
	@Test
	public void deleteEmail() throws InterruptedException {

		campObj.compaingsButton();
		Thread.sleep(1000);
		campObj.templatesButton();
		Thread.sleep(1000);
		campObj.fieldSelect();
		Thread.sleep(1000);
		campObj.selecyEmail();
		Thread.sleep(1000);
		campObj.iconDelete();
		Thread.sleep(1000);
		campObj.confirmDelete();
		Thread.sleep(1000);
		campObj.clickXclose();

	}

	
	@Test
	public void T1() throws InterruptedException {

		campObj.compaingsButton();
		Thread.sleep(1000);
		campObj.templatesButton();
		Thread.sleep(1000);
		campObj.newButton();
		Thread.sleep(1000);
		campObj.nameField("Babur");
		Thread.sleep(1000);
		campObj.subjectField("Nami");
		Thread.sleep(1000);
		campObj.attachmentsField("Liverpool");
		Thread.sleep(1000);
		campObj.bodyField("Noor Teck");
		Thread.sleep(1000);
		campObj.templateType();
		Thread.sleep(1000);
		campObj.emailSelect();
		Thread.sleep(1000);
		campObj.saveButton();
		Thread.sleep(1000);

	}

	@Ignore
	@Test
	public void T2() throws InterruptedException {

		campObj.compaingsButton();
		Thread.sleep(1000);
		campObj.templatesButton();
		Thread.sleep(1000);
		campObj.newButton();
		Thread.sleep(1000);
		campObj.nameField("Jaward");
		Thread.sleep(1000);
		campObj.subjectField("Abdula");
		Thread.sleep(1000);
		campObj.attachmentsField("Better Hair Cut");
		Thread.sleep(1000);
		campObj.bodyField("Computer Suks");
		Thread.sleep(1000);
		campObj.templateType();
		Thread.sleep(1000);
		campObj.phoneSelect();
		Thread.sleep(1000);
		campObj.saveButton();
		Thread.sleep(1000);

	}
}
